package com.example.ebay_interview.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
// http://api.geonames.org/earthquakesJSON?formatted=true&north=55.1&south=-9.9&east=-22.4&west=55.2&username=mkoppelman
private const val BASE_URL = "http://api.geonames.org/earthquakesJSON?"

object RetrofitInstance {

    private val retrofitGson = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val earthService = retrofitGson.create(EarthService::class.java)

}