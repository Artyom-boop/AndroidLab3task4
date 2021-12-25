package com.example.androidlab3

import android.content.Intent

import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import com.example.androidlab3.databinding.Activity2Binding


class Activity2 : BaseActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        binding.toFirst.setOnClickListener {
            finish()
        }
        binding.toThird.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    Activity3::class.java
                ).setFlags(FLAG_ACTIVITY_NEW_TASK)
            )
        }
        setContentView(binding.root)
    }
}