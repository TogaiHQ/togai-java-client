import com.togai.client.ApiClient;
import com.togai.client.Configuration;
import com.togai.client.ApiException;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.math.BigDecimal;


public class Example {
    public static void main(String[] args) throws InterruptedException{
        final String API_TOKEN = "YOUR TOKEN";
        final String BASE_PATH = "https://sandbox-api.togai.com";

        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setBasePath(BASE_PATH);
        apiClient.setBearerToken(API_TOKEN);


        // Following example simulates the pricing of an API based SMS service which charges their customers based on region and size of the message.
        // Follow the steps below to create the required entities in Togai, and then ingest an event.

        // Step 1: Create an Event Schema to define the event structure, attributes (can be usage value) and dimensions (can be used filters in usage meters i.e country in this case)
        try {
            final EventSchemasApi eventSchemasApi = new EventSchemasApi(apiClient);
            final CreateEventSchemaRequest createEventSchemaRequest = new CreateEventSchemaRequest()
                .name("sms-event")
                .description("SMS Event")
                .attributes(Arrays.asList(
                    new EventAttributeSchema()
                        .name("sms_id")
                ))
                .dimensions(Arrays.asList(
                    new DimensionsSchema()
                        .name("country")
                ));
            final EventSchema eventSchema = eventSchemasApi.createEventSchema(createEventSchemaRequest);
            System.out.println(eventSchema);

            // Step 2: Activate the event schema
            eventSchemasApi.activateEventSchema(eventSchema.getName());

            // Step 3: Create a Usage Meter to meter the usage with aggregation methods
            final UsageMetersApi usageMetersApi = new UsageMetersApi(apiClient);
            final CreateUsageMeterRequest createUsageMeterRequest = new CreateUsageMeterRequest()
                .name("message_count")
                .type(CreateUsageMeterRequest.TypeEnum.COUNTER)
                .aggregation(CreateUsageMeterRequest.AggregationEnum.COUNT)
                .computations(Arrays.asList(
                    new Computation()
                        .matcher("{'==': [{'var': 'dimensions.country'}, 'US']}")
                        .computation("1")
                ));
            final UsageMeter usageMeter = usageMetersApi.createUsageMeter(eventSchema.getName(), createUsageMeterRequest);
            System.out.println(usageMeter);
            
            // Step 4: Activate a usage meter
            usageMetersApi.activateUsageMeter(eventSchema.getName(), usageMeter.getName());

            // Step 5: Create a Price plan to convert the usage into a billable price
            final PricePlansApi pricePlansApi = new PricePlansApi(apiClient);
            final CreatePricePlanRequest createPricePlanRequest = new CreatePricePlanRequest()
                .name("price-plan")
                .pricePlanDetails(new PricePlanDetails()
                    .pricingCycleConfig(new PricingCycleConfig()
                        .interval(PricingCycleConfig.IntervalEnum.MONTHLY)
                        .startType(PricingCycleConfig.StartTypeEnum.STATIC)
                        .startOffset(new PricingCycleConfigStartOffset()
                            .dayOffset("1")
                            .monthOffset("NIL")
                        )
                        .gracePeriod(1)
                    )
                    .rateCards(Arrays.asList(
                            new RateCard()
                            .displayName("SMS Charges")
                            .pricingModel(PricingModel.TIERED)
                            .rateConfig(new RateConfigUsage()
                                .usageMeterName(usageMeter.getName())
                                .slabs(Arrays.asList(
                                    new SlabUsage()
                                        .rate(BigDecimal.valueOf(0.2))
                                        .startAfter(BigDecimal.valueOf(0.0))
                                        .priceType(PriceType.PER_UNIT)
                                        .order(1),
                                    new SlabUsage()
                                        .rate(BigDecimal.valueOf(0.1))
                                        .startAfter(BigDecimal.valueOf(10000.0))
                                        .priceType(PriceType.PER_UNIT)
                                        .order(2)
                                ))
                            )
                        )
                    )
                );
            final PricePlan pricePlan = pricePlansApi.createPricePlan(createPricePlanRequest);
            System.out.println(pricePlan);

            // Step 6: Activate the Price Plan
            pricePlansApi.activatePricePlan(pricePlan.getName());

            // Step 7: Create customers to associate price plans
            final CustomersApi customersApi = new CustomersApi(apiClient);
            final CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest()
                .name("customer1")
                .id("1")
                .primaryEmail("email@togai.com")
                .billingAddress("221B Baker Street, Marylebone, London NW1 6XE, United Kingdom");
            final CreateCustomerResponse customer = customersApi.createCustomer(createCustomerRequest);
            System.out.println(customer);

            // Step 8: Associate the customer/account to the price plan
            final AccountsApi accountsApi = new AccountsApi(apiClient);
            final AssociatePricePlanRequest associatePricePlanRequest = new AssociatePricePlanRequest()
                .pricePlanName(pricePlan.getName())
                .effectiveFrom(LocalDate.now())
                .effectiveUntil(LocalDate.of(9999, 1, 1));
            final AssociatePricePlanResponse account = accountsApi.associatePricePlan(customer.getId(), customer.getId(), associatePricePlanRequest);
            System.out.println(account);

            // Step 9: Ingest events
            final EventIngestionApi eventIngestionApi = new EventIngestionApi(apiClient);
            final IngestEventRequest ingestEventRequest = new IngestEventRequest()
                .event(new Event()
                    .id("random-string" + Math.random())
                    .eventName(eventSchema.getName())
                    .eventTimestamp(OffsetDateTime.now())
                    .accountId(customer.getId())
                    .eventAttributes(Arrays.asList(
                        new EventAttribute()
                            .attributeName("sms_id")
                            .attributeValue("random-string" + Math.random())
                    ))
                    .dimensions(Collections.singletonMap("country", "US"))
                );
            eventIngestionApi.ingest(ingestEventRequest);

            Thread.sleep(70000);

            // Step 10: Get the usage metrics 
            OffsetDateTime now = OffsetDateTime.now();
            OffsetDateTime yesterday = now.minusDays(1);
            final MetricsApi metricsApi = new MetricsApi(apiClient);
            final GetMetricsRequest usageMetricsRequest = new GetMetricsRequest()
                .startTime(yesterday)
                .endTime(now)
                .metricQueries(Collections.singleton(
                    new MetricQuery()
                        .id("usage-metrics")
                        .name(MetricName.USAGE)
                        .aggregationPeriod(MetricQuery.AggregationPeriodEnum.DAY)
                ));
            final GetMetricsResponse usageMetrics = metricsApi.getMetrics(usageMetricsRequest);
            System.out.println(usageMetrics);

            // Step 11: Get the revenue metrics
            // Revenue metrics might take a bit of time to be reflected in the system
            // You can check the docs on the amount of time it takes for events to get processed for revenue.
            final GetMetricsRequest revenueMetricsRequest = new GetMetricsRequest()
                .startTime(yesterday)
                .endTime(now)
                .metricQueries(Collections.singleton(
                    new MetricQuery()
                        .id("revenue-metrics")
                        .name(MetricName.REVENUE)
                        .aggregationPeriod(MetricQuery.AggregationPeriodEnum.DAY)
                ));
            final GetMetricsResponse revenueMetrics = metricsApi.getMetrics(revenueMetricsRequest);
            System.out.println(revenueMetrics);

            // Revenue metrics for a specific customer
            final GetMetricsRequest customerRevenueMetricsRequest = new GetMetricsRequest()
                .startTime(yesterday)
                .endTime(now)
                .metricQueries(Collections.singleton(
                    new MetricQuery()
                        .id("customer-revenue-metrics")
                        .name(MetricName.REVENUE)
                        .aggregationPeriod(MetricQuery.AggregationPeriodEnum.DAY)
                        .filters(Collections.singletonList(
                            new MetricQueryFilterEntry()
                                .fieldName("CUSTOMER_ID")
                                .fieldValues(Collections.singletonList(customer.getId()))
                        ))
                ));
            final GetMetricsResponse customerRevenueMetrics = metricsApi.getMetrics(customerRevenueMetricsRequest);
            System.out.println(customerRevenueMetrics);
        } catch (ApiException e) {
            System.err.println("Exception when calling apis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
