

# IngestionStatus

Status about the event ingestion.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Ingestion status |  |
|**statusDescription** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INGESTION_IN_PROGRESS | &quot;INGESTION_IN_PROGRESS&quot; |
| INGESTION_FAILED | &quot;INGESTION_FAILED&quot; |
| INGESTION_FAILED_SCHEMA_NOT_DEFINED | &quot;INGESTION_FAILED_SCHEMA_NOT_DEFINED&quot; |
| INGESTION_FAILED_UNITS_INVALID | &quot;INGESTION_FAILED_UNITS_INVALID&quot; |
| INGESTION_FAILED_EVENT_INVALID | &quot;INGESTION_FAILED_EVENT_INVALID&quot; |
| INGESTION_COMPLETED_NO_MATCHING_METERS | &quot;INGESTION_COMPLETED_NO_MATCHING_METERS&quot; |
| INGESTION_COMPLETED_EVENT_METERED | &quot;INGESTION_COMPLETED_EVENT_METERED&quot; |
| INGESTION_COMPLETED_EVENT_NOT_METERED | &quot;INGESTION_COMPLETED_EVENT_NOT_METERED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |


## Implemented Interfaces

* Serializable


