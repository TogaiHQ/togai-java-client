/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.client.api;

import com.togai.client.ApiCallback;
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.ApiResponse;
import com.togai.client.Configuration;
import com.togai.client.Pair;
import com.togai.client.ProgressRequestBody;
import com.togai.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.togai.client.models.ErrorResponse;
import com.togai.client.models.IngestBatchEventRequest;
import com.togai.client.models.IngestBatchEventResponse;
import com.togai.client.models.IngestEventRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EventIngestionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventIngestionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventIngestionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for ingest
     * @param ingestEventRequest Request body to ingest events to Togai usage and billing management service. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestCall(IngestEventRequest ingestEventRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = ingestEventRequest;

        // create path and map variables
        String localVarPath = "/ingest";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ingestValidateBeforeCall(IngestEventRequest ingestEventRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ingestEventRequest' is set
        if (ingestEventRequest == null) {
            throw new ApiException("Missing the required parameter 'ingestEventRequest' when calling ingest(Async)");
        }

        return ingestCall(ingestEventRequest, _callback);

    }

    /**
     * Ingest events to Togai
     * This API let’s you to ingest events to your Togai account. Events ingested using this API will be processed via associated usage meters and further via associated price plans to generate final billable value to invoice the customer Read more about [Event Ingestion](https://docs.togai.com/docs/event-ingestion) 
     * @param ingestEventRequest Request body to ingest events to Togai usage and billing management service. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public void ingest(IngestEventRequest ingestEventRequest) throws ApiException {
        ingestWithHttpInfo(ingestEventRequest);
    }

    /**
     * Ingest events to Togai
     * This API let’s you to ingest events to your Togai account. Events ingested using this API will be processed via associated usage meters and further via associated price plans to generate final billable value to invoice the customer Read more about [Event Ingestion](https://docs.togai.com/docs/event-ingestion) 
     * @param ingestEventRequest Request body to ingest events to Togai usage and billing management service. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ingestWithHttpInfo(IngestEventRequest ingestEventRequest) throws ApiException {
        okhttp3.Call localVarCall = ingestValidateBeforeCall(ingestEventRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Ingest events to Togai (asynchronously)
     * This API let’s you to ingest events to your Togai account. Events ingested using this API will be processed via associated usage meters and further via associated price plans to generate final billable value to invoice the customer Read more about [Event Ingestion](https://docs.togai.com/docs/event-ingestion) 
     * @param ingestEventRequest Request body to ingest events to Togai usage and billing management service. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestAsync(IngestEventRequest ingestEventRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ingestValidateBeforeCall(ingestEventRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ingestBatch
     * @param ingestBatchEventRequest Request body to ingest events in batch to Togai usage and billing management service. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Partial failure. Few events from request were not accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestBatchCall(IngestBatchEventRequest ingestBatchEventRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = ingestBatchEventRequest;

        // create path and map variables
        String localVarPath = "/ingestBatch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ingestBatchValidateBeforeCall(IngestBatchEventRequest ingestBatchEventRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ingestBatchEventRequest' is set
        if (ingestBatchEventRequest == null) {
            throw new ApiException("Missing the required parameter 'ingestBatchEventRequest' when calling ingestBatch(Async)");
        }

        return ingestBatchCall(ingestBatchEventRequest, _callback);

    }

    /**
     * Ingest events to Togai in batch
     * This API let’s you to ingest events in batch upto 1000 events. Ingest large amounts of events up to 1000 in batches in an array using this API.
     * @param ingestBatchEventRequest Request body to ingest events in batch to Togai usage and billing management service. (required)
     * @return IngestBatchEventResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Partial failure. Few events from request were not accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public IngestBatchEventResponse ingestBatch(IngestBatchEventRequest ingestBatchEventRequest) throws ApiException {
        ApiResponse<IngestBatchEventResponse> localVarResp = ingestBatchWithHttpInfo(ingestBatchEventRequest);
        return localVarResp.getData();
    }

    /**
     * Ingest events to Togai in batch
     * This API let’s you to ingest events in batch upto 1000 events. Ingest large amounts of events up to 1000 in batches in an array using this API.
     * @param ingestBatchEventRequest Request body to ingest events in batch to Togai usage and billing management service. (required)
     * @return ApiResponse&lt;IngestBatchEventResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Partial failure. Few events from request were not accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IngestBatchEventResponse> ingestBatchWithHttpInfo(IngestBatchEventRequest ingestBatchEventRequest) throws ApiException {
        okhttp3.Call localVarCall = ingestBatchValidateBeforeCall(ingestBatchEventRequest, null);
        Type localVarReturnType = new TypeToken<IngestBatchEventResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Ingest events to Togai in batch (asynchronously)
     * This API let’s you to ingest events in batch upto 1000 events. Ingest large amounts of events up to 1000 in batches in an array using this API.
     * @param ingestBatchEventRequest Request body to ingest events in batch to Togai usage and billing management service. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successfully accepted to process all the events from payload. </td><td>  -  </td></tr>
        <tr><td> 207 </td><td> Partial failure. Few events from request were not accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service is currently unavailable to process the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestBatchAsync(IngestBatchEventRequest ingestBatchEventRequest, final ApiCallback<IngestBatchEventResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = ingestBatchValidateBeforeCall(ingestBatchEventRequest, _callback);
        Type localVarReturnType = new TypeToken<IngestBatchEventResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
