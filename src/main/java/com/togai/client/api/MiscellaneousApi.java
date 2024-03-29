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


import com.togai.client.models.CalculateRevenueRequest;
import com.togai.client.models.CalculateRevenueResponse;
import com.togai.client.models.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MiscellaneousApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MiscellaneousApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MiscellaneousApi(ApiClient apiClient) {
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
     * Build call for calculateRevenue
     * @param calculateRevenueRequest Request payload for calculateRevenueAPI (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response payload for calculateRevenueAPI </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call calculateRevenueCall(CalculateRevenueRequest calculateRevenueRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = calculateRevenueRequest;

        // create path and map variables
        String localVarPath = "/revenue_calculator";

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
    private okhttp3.Call calculateRevenueValidateBeforeCall(CalculateRevenueRequest calculateRevenueRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'calculateRevenueRequest' is set
        if (calculateRevenueRequest == null) {
            throw new ApiException("Missing the required parameter 'calculateRevenueRequest' when calling calculateRevenue(Async)");
        }

        return calculateRevenueCall(calculateRevenueRequest, _callback);

    }

    /**
     * Calculate and return the revenue for a existing or new price plan
     * Calculate and return the revenue for a existing or new price plan
     * @param calculateRevenueRequest Request payload for calculateRevenueAPI (required)
     * @return CalculateRevenueResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response payload for calculateRevenueAPI </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public CalculateRevenueResponse calculateRevenue(CalculateRevenueRequest calculateRevenueRequest) throws ApiException {
        ApiResponse<CalculateRevenueResponse> localVarResp = calculateRevenueWithHttpInfo(calculateRevenueRequest);
        return localVarResp.getData();
    }

    /**
     * Calculate and return the revenue for a existing or new price plan
     * Calculate and return the revenue for a existing or new price plan
     * @param calculateRevenueRequest Request payload for calculateRevenueAPI (required)
     * @return ApiResponse&lt;CalculateRevenueResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response payload for calculateRevenueAPI </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CalculateRevenueResponse> calculateRevenueWithHttpInfo(CalculateRevenueRequest calculateRevenueRequest) throws ApiException {
        okhttp3.Call localVarCall = calculateRevenueValidateBeforeCall(calculateRevenueRequest, null);
        Type localVarReturnType = new TypeToken<CalculateRevenueResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Calculate and return the revenue for a existing or new price plan (asynchronously)
     * Calculate and return the revenue for a existing or new price plan
     * @param calculateRevenueRequest Request payload for calculateRevenueAPI (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response payload for calculateRevenueAPI </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call calculateRevenueAsync(CalculateRevenueRequest calculateRevenueRequest, final ApiCallback<CalculateRevenueResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = calculateRevenueValidateBeforeCall(calculateRevenueRequest, _callback);
        Type localVarReturnType = new TypeToken<CalculateRevenueResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
