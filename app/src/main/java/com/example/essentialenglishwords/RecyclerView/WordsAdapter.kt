package com.example.essentialenglishwords.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Json.Reading
import com.example.essentialenglishwords.R

val jsonProcess: JsonProcess = JsonProcess()


class WordsAdapter(val context: Context):RecyclerView.Adapter<WordHolder>() {

    val listUnit:ArrayList<Reading> = ArrayList<Reading>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordHolder {
        return WordHolder(LayoutInflater.from(context).inflate(R.layout.word_holder,parent,false))
    }

    override fun onBindViewHolder(holder: WordHolder, position: Int) {

//        holder.textUnit.text = jsonProcess.reading(context,0).name

        println(">>>"+jsonProcess.reading(context,1).name)
//        holder.pictureUnit.setImageDrawable(jsonProcess.reading(context,position).image)

//        for (index in 0..30){
//
//            holder.pictureUnit.setImageResource(jsonProcess.reading(context,index).image.toInt())
//
//            holder.textUnit.setText(jsonProcess.reading(context,index).name)
//
//        }




    }

    override fun getItemCount(): Int {
        return 10
    }
}