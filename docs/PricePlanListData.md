

# PricePlanListData

Data of price plan list

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the price plan |  |
|**description** | **String** | Description of price plan |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of Price plan |  |
|**usageMeters** | **List&lt;String&gt;** | Usage meters name linked to the price plan |  |
|**pricePlanDetails** | [**PricePlanDetails**](PricePlanDetails.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


