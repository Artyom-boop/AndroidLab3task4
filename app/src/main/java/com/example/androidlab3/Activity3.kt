package com.example.androidlab3

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.androidlab3.databinding.Activity3Binding

class Activity3 : BaseActivity() {

    private lateinit var binding: Activity3Binding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = Activity3Binding.inflate(layoutInflater)
        binding.toFirst.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    Activity1::class.java
                ).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            )
        }
        binding.toSecond.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    Activity2::class.java
                ).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            )
        }
        setContentView(binding.root)
    }
}