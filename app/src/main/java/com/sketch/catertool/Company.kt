package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.sketch.catertool.databinding.ActivityCompanyBinding

class Company : AppCompatActivity() {

    private lateinit var binding: ActivityCompanyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        tvHeader.text = R.string.company.toString()

        val ivBackImg = findViewById<ImageButton>(R.id.ivBackImg)
        ivBackImg.setOnClickListener{
            finish()
        }

        binding.btnSave.setOnClickListener {
            val intent = Intent(this,PostalAddress::class.java)
            startActivity(intent)
        }

    }

}
