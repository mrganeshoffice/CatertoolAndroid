package com.sketch.catertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sketch.catertool.databinding.ActivityUsersListBinding

class UsersList : AppCompatActivity() {

    private lateinit var binding: ActivityUsersListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsersListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}