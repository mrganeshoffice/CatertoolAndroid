package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityCompanyBinding
import com.sketch.catertool.databinding.ActivityMainBinding
import com.sketch.catertool.databinding.ActivityOtpVerificationBinding

class OTPVerification : AppCompatActivity() {

    private lateinit var binding: ActivityOtpVerificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        binding.btnVerify.setOnClickListener {
            val intent = Intent(this,Thankyou::class.java)
            startActivity(intent)
        }

    }

}