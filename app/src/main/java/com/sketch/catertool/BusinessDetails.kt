package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityAddUserBinding
import com.sketch.catertool.databinding.ActivityBusinessDetailsBinding

class BusinessDetails : AppCompatActivity() {

    private lateinit var binding: ActivityBusinessDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBusinessDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        binding.btnVerifyLogin.setOnClickListener {
            val intent = Intent(this,OTPVerification::class.java)
            startActivity(intent)
        }

    }

}