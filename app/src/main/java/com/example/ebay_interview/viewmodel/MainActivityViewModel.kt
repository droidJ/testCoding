package com.example.ebay_interview.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ebay_interview.api.RetrofitInstance
import com.example.ebay_interview.model.Earthquake
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    // presentations & remote

    private val _earths = MutableLiveData<List<Earthquake>>()
    val earths = _earths // observe

    fun fetchData(){
        viewModelScope.launch {
            val remoteData = RetrofitInstance.earthService.getEarthList()
            _earths.value = remoteData ?: emptyList()
        }
    }

}