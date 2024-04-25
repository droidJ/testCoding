package com.example.ebay_interview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.ebay_interview.databinding.ActivityMainBinding
import com.example.ebay_interview.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set up view & viewModel
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

    }

}