package com.example.ebay_interview.api

import com.example.ebay_interview.model.Earthquake
import retrofit2.http.GET

interface EarthService {

    // get method
    @GET("formatted=true&north=55.1&south=-9.9&east=-22.4&west=55.2&username=mkoppelman")
    suspend fun getEarthList(): List<Earthquake>?

}