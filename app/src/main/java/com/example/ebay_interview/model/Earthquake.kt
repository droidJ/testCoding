package com.example.ebay_interview.model
// http://api.geonames.org/earthquakesJSON?formatted=true&north=55.1&south=-9.9&east=-22.4&west=55.2&username=mkoppelman
data class Earthquake(
    val eqid : String,
    val magnitude : Double
)

/*
*
*
*
{
    "datetime": "2011-03-11 05:46:23",
    "depth": 24.4,
    "lng": 142.369,
    "src": "us",
    "eqid": "c0001xgp",
    "magnitude": 8.8,
    "lat": 38.322
  },
*
*
* */