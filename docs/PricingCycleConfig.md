

# PricingCycleConfig

Represents configurations related to pricing cycle

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | [**IntervalEnum**](#IntervalEnum) |  |  |
|**startType** | [**StartTypeEnum**](#StartTypeEnum) |  |  |
|**startOffset** | [**PricingCycleConfigStartOffset**](PricingCycleConfigStartOffset.md) |  |  |
|**gracePeriod** | **Integer** |  |  |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| HALF_YEARLY | &quot;HALF_YEARLY&quot; |
| ANNUALLY | &quot;ANNUALLY&quot; |



## Enum: StartTypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;STATIC&quot; |


## Implemented Interfaces

* Serializable


