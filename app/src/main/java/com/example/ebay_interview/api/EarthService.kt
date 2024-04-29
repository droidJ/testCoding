package com.example.ebay_interview.api

import com.example.ebay_interview.model.Earthquakes
import retrofit2.http.GET
import retrofit2.http.Query

interface EarthService {

    @GET("earthquakesJSON")
    suspend fun getEarthList(
        @Query("formatted") formatted: Boolean,
        @Query("north") north: Double,
        @Query("south") south: Double,
        @Query("east") east: Double,
        @Query("west") west: Double,
        @Query("username") username: String
    ): Earthquakes

    // this one works also
    @GET("earthquakesJSON?formatted=true&north=55.1&south=-9.9&east=-22.4&west=55.2&username=mkoppelman")
    suspend fun getEarthList1(): Earthquakes

}