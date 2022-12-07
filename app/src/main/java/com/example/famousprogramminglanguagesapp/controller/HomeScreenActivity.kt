package com.example.famousprogramminglanguagesapp.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.famousprogramminglanguagesapp.R
import com.example.famousprogramminglanguagesapp.databinding.ActivityHomeScreenBinding

class HomeScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            val intent =  Intent(this@HomeScreenActivity,LoginActivity::class.java)

            startActivity(intent)
        }

    }
}