package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.sketch.catertool.databinding.ActivityAddUserBinding
import com.sketch.catertool.databinding.ActivityCompanyDetailsBinding
import com.sketch.catertool.databinding.ActivityMainBinding

class AddUser : AppCompatActivity() {

    private lateinit var binding: ActivityAddUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        tvHeader.text = R.string.add_user.toString()

        val ivBackImg = findViewById<ImageButton>(R.id.ivBackImg)
        ivBackImg.setOnClickListener{
            finish()
        }

        binding.btnAdd.setOnClickListener {
            val intent = Intent(this,PostalAddress::class.java)
            startActivity(intent)
        }

    }

}