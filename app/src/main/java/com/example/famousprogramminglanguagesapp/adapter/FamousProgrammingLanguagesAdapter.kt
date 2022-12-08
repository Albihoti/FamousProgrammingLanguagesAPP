package com.example.famousprogramminglanguagesapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.famousprogramminglanguagesapp.R
import com.example.famousprogramminglanguagesapp.model.FamousProgrammingLanguagesModel

class FamousProgrammingLanguagesAdapter(private val context: Context, private val famousProgramminList: List<FamousProgrammingLanguagesModel>): BaseAdapter() {
    private val inflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int = famousProgramminList.size

    override fun getItem(p0: Int): Any = famousProgramminList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
      val rowCell = inflater.inflate(R.layout.activity_famous_programming_languages_list_details, p2, false)
        val ivIcon = rowCell.findViewById<ImageView>(R.id.ivIcon)
        val tvName = rowCell.findViewById<TextView>(R.id.tvName)
        val tvSince = rowCell.findViewById<TextView>(R.id.tvSince)
        val tvUsed = rowCell.findViewById<TextView>(R.id.tvUsed)


        famousProgramminList[p0].img?.let { ivIcon.setImageResource(it) }
        tvName.text=famousProgramminList[p0].name
        tvSince.text = famousProgramminList[p0].since
        tvUsed.text = famousProgramminList[p0].usedPercentage
        return  rowCell;




    }

}