package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
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

        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        tvHeader.text = R.string.business_details.toString()

        val ivBackImg = findViewById<ImageButton>(R.id.ivBackImg)
        ivBackImg.setOnClickListener{
            finish()
        }

        binding.btnNext.setOnClickListener {
            val intent = Intent(this,PostalAddress::class.java)
            startActivity(intent)
        }

    }

}