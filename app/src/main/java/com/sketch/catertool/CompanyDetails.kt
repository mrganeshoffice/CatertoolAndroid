package com.sketch.catertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.sketch.catertool.databinding.ActivityCompanyDetailsBinding

class CompanyDetails : AppCompatActivity() {

    private lateinit var binding: ActivityCompanyDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanyDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        /*val tvHeader = findViewById<TextView>(R.id.tvHeader)
        tvHeader.text = R.string.company_details.toString()

        val ivBackImg = findViewById<ImageButton>(R.id.ivBackImg)
        ivBackImg.setOnClickListener{
            finish()
        }*/

    }

}