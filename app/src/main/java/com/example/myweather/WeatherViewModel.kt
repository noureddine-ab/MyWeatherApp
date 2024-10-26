package com.example.myweather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myweather.API.Constant
import com.example.myweather.API.RetrofitInstance
import kotlinx.coroutines.launch

class WeatherViewModel: ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi
    fun getData(city:String){
        viewModelScope.launch {
            val response = weatherApi.getWeather(Constant.apikey,city)
            if (response.isSuccessful){

            }else{

            }
        }

    }
}