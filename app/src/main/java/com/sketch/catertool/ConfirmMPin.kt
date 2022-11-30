package com.sketch.catertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityConfirmMpinBinding

class ConfirmMPin : AppCompatActivity() {

    private lateinit var binding: ActivityConfirmMpinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmMpinBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}