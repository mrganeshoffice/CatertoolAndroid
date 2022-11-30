package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityPostalAddressBinding

class PostalAddress : AppCompatActivity() {

    private lateinit var binding: ActivityPostalAddressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostalAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this,OTPVerification::class.java)
            startActivity(intent)
        }

    }
}