package com.example.ebay_interview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ebay_interview.model.Earthquake
import com.example.ebay_interview.databinding.ActivityMainBinding
import com.example.ebay_interview.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var adapter: EarthAdapter
    private val list = mutableListOf<Earthquake>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set up view & viewModel
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // set view : adapter
        adapter = EarthAdapter(list)
        viewBinding.rv.adapter = adapter
        viewBinding.rv.layoutManager = LinearLayoutManager(this)

        // set observer
        viewModel.earths.observe(this, Observer { data ->
            list.clear()
            list.addAll(data)
            adapter.notifyDataSetChanged()
        })

        // api call here
        viewModel.fetchData()
    }

}