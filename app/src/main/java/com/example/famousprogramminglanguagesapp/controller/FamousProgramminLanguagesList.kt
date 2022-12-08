package com.example.famousprogramminglanguagesapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import com.example.famousprogramminglanguagesapp.R
import com.example.famousprogramminglanguagesapp.adapter.FamousProgrammingLanguagesAdapter
import com.example.famousprogramminglanguagesapp.databinding.ActivityFamousProgramminLanguagesListBinding
import com.example.famousprogramminglanguagesapp.databinding.ActivityLoginBinding
import com.example.famousprogramminglanguagesapp.model.FamousProgrammingLanguagesModel

class FamousProgramminLanguagesList : AppCompatActivity() {
    private lateinit var binding: ActivityFamousProgramminLanguagesListBinding
    private lateinit var famousProgramminLanguagesList: List<FamousProgrammingLanguagesModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFamousProgramminLanguagesListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        famousProgramminLanguagesList= listOf(
            FamousProgrammingLanguagesModel(R.drawable.jsimg, "Javascript","Since: 1995","User: 69.7%"),
            FamousProgrammingLanguagesModel(R.drawable.pythonimage,"Python","Since: 1991","Used:48.07%"),
            FamousProgrammingLanguagesModel(R.drawable.htmlcssimg1,"HTML/CSS","Since: 1996","Used: 55.08%"),
            FamousProgrammingLanguagesModel(R.drawable.sqlimg,"SQL","Since: 1970","Used: 49.43%"),
            FamousProgrammingLanguagesModel(R.drawable.typescriptimg,"TypeScript","Since: 2012","34.83%"),
            FamousProgrammingLanguagesModel(R.drawable.javaimage,"Java","Since: 1995","33.27%"),
            FamousProgrammingLanguagesModel(R.drawable.bashshellimage,"Bash/Shell","Since: 1989","Used: 29.07%"),
            FamousProgrammingLanguagesModel(R.drawable.csharpimg,"C#","Since: 2000","Used: 27.98%"),
            FamousProgrammingLanguagesModel(R.drawable.cplusimg, "C++","Since: 1983","22.55%"),
            FamousProgrammingLanguagesModel(R.drawable.phpimg,"PHP","Since: 1994","Used: 20.87%")
        )

        val famousProgrammingLanguagesAdapter = FamousProgrammingLanguagesAdapter(this,famousProgramminLanguagesList)

        binding.lvFamousProgrammingLanguages.adapter = famousProgrammingLanguagesAdapter

        binding.lvFamousProgrammingLanguages.setOnItemClickListener{ adapterView, view, position, l->
            Toast.makeText(
                this,
                "This language is called: ${famousProgramminLanguagesList[position].name} and is created : ${famousProgramminLanguagesList[position].since}",
                Toast.LENGTH_LONG
            ).show();
        }


    }




}