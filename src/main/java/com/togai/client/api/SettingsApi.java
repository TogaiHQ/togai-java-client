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
import com.togai.client.models.Setting;
import com.togai.client.models.SettingPaginatedResponse;
import com.togai.client.models.UpdateSettingRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SettingsApi(ApiClient apiClient) {
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
     * Build call for getSetting
     * @param settingIdStr  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSettingCall(String settingIdStr, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/{setting_id_str}"
            .replace("{" + "setting_id_str" + "}", localVarApiClient.escapeString(settingIdStr.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSettingValidateBeforeCall(String settingIdStr, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'settingIdStr' is set
        if (settingIdStr == null) {
            throw new ApiException("Missing the required parameter 'settingIdStr' when calling getSetting(Async)");
        }

        return getSettingCall(settingIdStr, _callback);

    }

    /**
     * Get a setting
     * Get a setting
     * @param settingIdStr  (required)
     * @return Setting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Setting getSetting(String settingIdStr) throws ApiException {
        ApiResponse<Setting> localVarResp = getSettingWithHttpInfo(settingIdStr);
        return localVarResp.getData();
    }

    /**
     * Get a setting
     * Get a setting
     * @param settingIdStr  (required)
     * @return ApiResponse&lt;Setting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Setting> getSettingWithHttpInfo(String settingIdStr) throws ApiException {
        okhttp3.Call localVarCall = getSettingValidateBeforeCall(settingIdStr, null);
        Type localVarReturnType = new TypeToken<Setting>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a setting (asynchronously)
     * Get a setting
     * @param settingIdStr  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSettingAsync(String settingIdStr, final ApiCallback<Setting> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSettingValidateBeforeCall(settingIdStr, _callback);
        Type localVarReturnType = new TypeToken<Setting>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for insertSetting
     * @param setting Payload to insert setting (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call insertSettingCall(Setting setting, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = setting;

        // create path and map variables
        String localVarPath = "/settings";

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
    private okhttp3.Call insertSettingValidateBeforeCall(Setting setting, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'setting' is set
        if (setting == null) {
            throw new ApiException("Missing the required parameter 'setting' when calling insertSetting(Async)");
        }

        return insertSettingCall(setting, _callback);

    }

    /**
     * Create a setting
     * Create a setting
     * @param setting Payload to insert setting (required)
     * @return Setting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Setting insertSetting(Setting setting) throws ApiException {
        ApiResponse<Setting> localVarResp = insertSettingWithHttpInfo(setting);
        return localVarResp.getData();
    }

    /**
     * Create a setting
     * Create a setting
     * @param setting Payload to insert setting (required)
     * @return ApiResponse&lt;Setting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Setting> insertSettingWithHttpInfo(Setting setting) throws ApiException {
        okhttp3.Call localVarCall = insertSettingValidateBeforeCall(setting, null);
        Type localVarReturnType = new TypeToken<Setting>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a setting (asynchronously)
     * Create a setting
     * @param setting Payload to insert setting (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call insertSettingAsync(Setting setting, final ApiCallback<Setting> _callback) throws ApiException {

        okhttp3.Call localVarCall = insertSettingValidateBeforeCall(setting, _callback);
        Type localVarReturnType = new TypeToken<Setting>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listSetting
     * @param entityType  (optional)
     * @param entityId  (optional)
     * @param settingId  (optional)
     * @param namespace  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for list setting request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSettingCall(String entityType, String entityId, String settingId, String namespace, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (entityType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("entity_type", entityType));
        }

        if (entityId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("entity_id", entityId));
        }

        if (settingId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("setting_id", settingId));
        }

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listSettingValidateBeforeCall(String entityType, String entityId, String settingId, String namespace, final ApiCallback _callback) throws ApiException {
        return listSettingCall(entityType, entityId, settingId, namespace, _callback);

    }

    /**
     * Lists settings
     * List settings
     * @param entityType  (optional)
     * @param entityId  (optional)
     * @param settingId  (optional)
     * @param namespace  (optional)
     * @return SettingPaginatedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for list setting request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public SettingPaginatedResponse listSetting(String entityType, String entityId, String settingId, String namespace) throws ApiException {
        ApiResponse<SettingPaginatedResponse> localVarResp = listSettingWithHttpInfo(entityType, entityId, settingId, namespace);
        return localVarResp.getData();
    }

    /**
     * Lists settings
     * List settings
     * @param entityType  (optional)
     * @param entityId  (optional)
     * @param settingId  (optional)
     * @param namespace  (optional)
     * @return ApiResponse&lt;SettingPaginatedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for list setting request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SettingPaginatedResponse> listSettingWithHttpInfo(String entityType, String entityId, String settingId, String namespace) throws ApiException {
        okhttp3.Call localVarCall = listSettingValidateBeforeCall(entityType, entityId, settingId, namespace, null);
        Type localVarReturnType = new TypeToken<SettingPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists settings (asynchronously)
     * List settings
     * @param entityType  (optional)
     * @param entityId  (optional)
     * @param settingId  (optional)
     * @param namespace  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for list setting request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSettingAsync(String entityType, String entityId, String settingId, String namespace, final ApiCallback<SettingPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSettingValidateBeforeCall(entityType, entityId, settingId, namespace, _callback);
        Type localVarReturnType = new TypeToken<SettingPaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSetting
     * @param settingIdStr  (required)
     * @param updateSettingRequest Payload to update setting (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSettingCall(String settingIdStr, UpdateSettingRequest updateSettingRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateSettingRequest;

        // create path and map variables
        String localVarPath = "/settings/{setting_id_str}"
            .replace("{" + "setting_id_str" + "}", localVarApiClient.escapeString(settingIdStr.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateSettingValidateBeforeCall(String settingIdStr, UpdateSettingRequest updateSettingRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'settingIdStr' is set
        if (settingIdStr == null) {
            throw new ApiException("Missing the required parameter 'settingIdStr' when calling updateSetting(Async)");
        }

        // verify the required parameter 'updateSettingRequest' is set
        if (updateSettingRequest == null) {
            throw new ApiException("Missing the required parameter 'updateSettingRequest' when calling updateSetting(Async)");
        }

        return updateSettingCall(settingIdStr, updateSettingRequest, _callback);

    }

    /**
     * Update a setting
     * Update a setting
     * @param settingIdStr  (required)
     * @param updateSettingRequest Payload to update setting (required)
     * @return Setting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Setting updateSetting(String settingIdStr, UpdateSettingRequest updateSettingRequest) throws ApiException {
        ApiResponse<Setting> localVarResp = updateSettingWithHttpInfo(settingIdStr, updateSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Update a setting
     * Update a setting
     * @param settingIdStr  (required)
     * @param updateSettingRequest Payload to update setting (required)
     * @return ApiResponse&lt;Setting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Setting> updateSettingWithHttpInfo(String settingIdStr, UpdateSettingRequest updateSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = updateSettingValidateBeforeCall(settingIdStr, updateSettingRequest, null);
        Type localVarReturnType = new TypeToken<Setting>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a setting (asynchronously)
     * Update a setting
     * @param settingIdStr  (required)
     * @param updateSettingRequest Payload to update setting (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> Response for insert and update settings request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSettingAsync(String settingIdStr, UpdateSettingRequest updateSettingRequest, final ApiCallback<Setting> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSettingValidateBeforeCall(settingIdStr, updateSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<Setting>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
