package com.example.ebay_interview.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "http://api.geonames.org/"

object RetrofitInstance {

    private val retrofitGson by lazy {
        Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val earthService: EarthService by lazy {
        retrofitGson.create(EarthService::class.java)
    }

}