package com.example.appinfo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appinfo.models.AppInfo
import com.example.appinfo.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response


class MainViewModel(private val repository: Repository): ViewModel() {
    val pushResponse: MutableLiveData<Response<AppInfo>> = MutableLiveData()

    fun pushStatus(
        deviceId: String,
        internetCon: Boolean,
        charging: Boolean,
        battery: Int,
        location: String
    ){
        viewModelScope.launch {
            val response = repository.pushStatus(deviceId, internetCon, charging, battery, location)
            pushResponse.value = response
        }
    }
}