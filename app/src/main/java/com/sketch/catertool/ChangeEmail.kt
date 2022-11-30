package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.sketch.catertool.databinding.ActivityChangeEmailBinding

class ChangeEmail : AppCompatActivity() {

    private lateinit var binding: ActivityChangeEmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangeEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        tvHeader.text = R.string.change_email.toString()

        val ivBackImg = findViewById<ImageButton>(R.id.ivBackImg)
        ivBackImg.setOnClickListener{
            finish()
        }

        binding.btnSubmitChanges.setOnClickListener {
            val intent = Intent(this,PostalAddress::class.java)
            startActivity(intent)
        }

    }

}