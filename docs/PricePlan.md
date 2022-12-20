

# PricePlan

Price plan entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the price plan |  |
|**description** | **String** | Description of price plan |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of Price plan |  |
|**pricingSchedule** | [**List&lt;PricingSchedule&gt;**](PricingSchedule.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


