package com.sketch.catertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityCompanyBinding
import com.sketch.catertool.databinding.ActivityMainBinding
import com.sketch.catertool.databinding.ActivityUsersBinding

class Users : AppCompatActivity() {

    private lateinit var binding: ActivityUsersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsersBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}