package com.example.appinfo.api

import com.example.appinfo.models.AppInfo
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("/status")
    suspend fun pushStatus(
        @Field("deviceId") deviceId: String,
        @Field("internetCon") internetCon: Boolean,
        @Field("charging") charging: Boolean,
        @Field("battery") battery: Int,
        @Field("location") location: String

    ): Response<AppInfo>
}