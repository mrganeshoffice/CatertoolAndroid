package com.sketch.catertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivitySetMpinBinding

class SetMPin : AppCompatActivity() {

    private lateinit var binding: ActivitySetMpinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySetMpinBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}