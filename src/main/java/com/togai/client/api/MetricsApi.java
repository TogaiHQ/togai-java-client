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
import com.togai.client.models.GetMetricsRequest;
import com.togai.client.models.GetMetricsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MetricsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetricsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetricsApi(ApiClient apiClient) {
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
     * Build call for getMetrics
     * @param getMetricsRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get metrics. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetricsCall(GetMetricsRequest getMetricsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getMetricsRequest;

        // create path and map variables
        String localVarPath = "/metrics";

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
    private okhttp3.Call getMetricsValidateBeforeCall(GetMetricsRequest getMetricsRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getMetricsCall(getMetricsRequest, _callback);
        return localVarCall;

    }

    /**
     * Get togai metrics.
     * To get the metrics, you make a POST request to the /metrics resource. You can query up to five metrics in a single request. Single response dataset can contain a maximum of 100 data points.
     * @param getMetricsRequest  (optional)
     * @return GetMetricsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get metrics. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public GetMetricsResponse getMetrics(GetMetricsRequest getMetricsRequest) throws ApiException {
        ApiResponse<GetMetricsResponse> localVarResp = getMetricsWithHttpInfo(getMetricsRequest);
        return localVarResp.getData();
    }

    /**
     * Get togai metrics.
     * To get the metrics, you make a POST request to the /metrics resource. You can query up to five metrics in a single request. Single response dataset can contain a maximum of 100 data points.
     * @param getMetricsRequest  (optional)
     * @return ApiResponse&lt;GetMetricsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get metrics. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetMetricsResponse> getMetricsWithHttpInfo(GetMetricsRequest getMetricsRequest) throws ApiException {
        okhttp3.Call localVarCall = getMetricsValidateBeforeCall(getMetricsRequest, null);
        Type localVarReturnType = new TypeToken<GetMetricsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get togai metrics. (asynchronously)
     * To get the metrics, you make a POST request to the /metrics resource. You can query up to five metrics in a single request. Single response dataset can contain a maximum of 100 data points.
     * @param getMetricsRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get metrics. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetricsAsync(GetMetricsRequest getMetricsRequest, final ApiCallback<GetMetricsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetricsValidateBeforeCall(getMetricsRequest, _callback);
        Type localVarReturnType = new TypeToken<GetMetricsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}