package com.example.famousprogramminglanguagesapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.famousprogramminglanguagesapp.R
import com.example.famousprogramminglanguagesapp.databinding.ActivityFamousProgrammingLanguagesListBinding
import com.example.famousprogramminglanguagesapp.databinding.ActivityHomeScreenBinding
import com.example.famousprogramminglanguagesapp.model.FamousProgrammingLanguages

class FamousProgrammingLanguagesList : AppCompatActivity() {
    private lateinit var binding: ActivityFamousProgrammingLanguagesListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_famous_programming_languages_list)
        binding = ActivityFamousProgrammingLanguagesListBinding.inflate(layoutInflater)

    }
    val famousProgrammingLanguagesList = listOf(
        FamousProgrammingLanguages(R.drawable.jsImage, "Javascript","Since: 1995","User: 69.7%"),
        FamousProgrammingLanguages(R.drawable.pythonImg,"Python","Since: 1991","Used:48.07%"),
        FamousProgrammingLanguages(R.drawable.htmlImage,"HTML/CSS","Since: 1996","Used: 55.08%"),
        FamousProgrammingLanguages(R.drawable.SqlImage,"SQL","Since: 1970","Used: 49.43%"),
        FamousProgrammingLanguages(R.drawable.typescriptImage, "TypeScript","Since: 2012","34.83%"),
        FamousProgrammingLanguages(R.drawable.javaImage,"Java","Since: 1995","33.27%"),
        FamousProgrammingLanguages(R.drawable.shellimage,"Bash/Shell","Since: 1989","Used: 29.07%"),
        FamousProgrammingLanguages(R.drawable.cImage,"C#","Since: 2000","Used: 27.98%"),
        FamousProgrammingLanguages(R.drawable.cc, "C++","Since: 1983","22.55%"),
        FamousProgrammingLanguages(R.drawable.phpImage,"PHP","Since: 1994","Used: 20.87%")
    )
}