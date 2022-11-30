package com.sketch.catertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityDetailUpdatedBinding

class DetailUpdated : AppCompatActivity() {

    private lateinit var binding: ActivityDetailUpdatedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailUpdatedBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}