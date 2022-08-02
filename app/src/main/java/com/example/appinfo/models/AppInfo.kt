package com.example.appinfo.models

data class AppInfo(
    val deviceId: String,
    val internetCon: Boolean,
    val charging: Boolean,
    val battery:Int,
    val location: String
)