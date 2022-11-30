package com.sketch.catertool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.sketch.catertool.databinding.ActivityAccessPermissionsBinding

class AccessPermissions : AppCompatActivity() {

    private lateinit var binding: ActivityAccessPermissionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccessPermissionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()

    }

    private fun onClicks() {

        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        tvHeader.text = R.string.access_permission.toString()

        val ivBackImg = findViewById<ImageButton>(R.id.ivBackImg)
        ivBackImg.setOnClickListener{
            finish()
        }

        binding.btnSave.setOnClickListener {
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
        }

    }

}