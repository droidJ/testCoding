package com.example.ebay_interview.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ebay_interview.api.RetrofitInstance
import com.example.ebay_interview.model.Earthquakes
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    // presentations & remote
    private val _earths = MutableLiveData<Earthquakes>()
    val earths: LiveData<Earthquakes> = _earths // observe
    fun fetchData() {
        viewModelScope.launch {
            //  Query : formatted=true&north=55.1&south=-9.9&east=-22.4&west=55.2&username=mkoppelman
            val remoteData = RetrofitInstance.earthService.getEarthList(
                true,
                55.1,
                -9.9,
                -22.4,
                55.2,
                "mkoppelman"
            )
            _earths.value = remoteData
        }
    }

}