

# AssociatePricePlanRequest

Request to associate a price plan to an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pricePlanName** | **String** | Name of the price plan |  |
|**effectiveFrom** | **LocalDate** | Date of effectiveness of the association. - Expected only if the account already has a price plan associated with it.  |  |
|**effectiveUntil** | **LocalDate** | Date until which the association must be effective. - Expected only if effectiveFrom is present.  |  |
|**pricePlanDetailsOverride** | [**PricePlanDetailsOverride**](PricePlanDetailsOverride.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


