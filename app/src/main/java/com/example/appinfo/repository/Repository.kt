package com.example.appinfo.repository

import com.example.appinfo.api.RetrofitInstance
import com.example.appinfo.models.AppInfo
import retrofit2.Response

class Repository {
    suspend fun pushStatus(
        deviceId: String,
        internetCon: Boolean,
        charging: Boolean,
        battery: Int,
        location: String
    ): Response<AppInfo> {
        return RetrofitInstance.api.pushStatus(deviceId, internetCon, charging, battery, location)
    }
}