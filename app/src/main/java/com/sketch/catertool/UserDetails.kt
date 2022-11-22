package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityCompanyBinding
import com.sketch.catertool.databinding.ActivityMainBinding
import com.sketch.catertool.databinding.ActivityUserDetailsBinding

class UserDetails : AppCompatActivity() {

    private lateinit var binding: ActivityUserDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        binding.btnNext.setOnClickListener {
            val intent = Intent(this,BusinessDetails::class.java)
            startActivity(intent)
        }

    }

}