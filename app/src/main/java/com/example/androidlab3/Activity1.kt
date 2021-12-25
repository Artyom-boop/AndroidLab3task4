package com.example.androidlab3

import android.content.Intent
import android.os.Bundle
import com.example.androidlab3.databinding.Activity1Binding


class Activity1 : BaseActivity() {

    private lateinit var binding: Activity1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)

        binding.toSecond.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    Activity2::class.java
                )
            )
        }
        setContentView(binding.root)
    }
}