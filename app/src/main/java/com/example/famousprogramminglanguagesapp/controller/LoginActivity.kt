package com.example.famousprogramminglanguagesapp.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.famousprogramminglanguagesapp.databinding.ActivityLoginBinding
import com.example.famousprogramminglanguagesapp.model.Person

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)




        val personList = listOf(
            Person("AlbiHoti","123123"),
            Person("MualaKabashi","123123"),
            Person("ErionFerizi","123123123"),
            Person("EnverIsmaili","123123123")
        )






        binding.btnLoginPage.setOnClickListener {

            if(personList.any{
                it.username.toString().equals(binding.etusername.text.toString())&&personList.any{
                    it.password.toString().equals(binding.etpw.text.toString())
                }
                })
            {
                val intent = Intent(this@LoginActivity, FamousProgramminLanguagesList::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Wrong Credentials",Toast.LENGTH_LONG).show()
            }
        }






    }
}