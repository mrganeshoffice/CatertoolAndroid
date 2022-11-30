package com.sketch.catertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityEditUserBinding

class EditUser : AppCompatActivity() {

    private lateinit var binding: ActivityEditUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}