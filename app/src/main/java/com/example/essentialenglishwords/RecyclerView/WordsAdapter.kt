package com.example.essentialenglishwords.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Json.ReadingClass
import com.example.essentialenglishwords.R

val jsonProcess: JsonProcess = JsonProcess()


class WordsAdapter(val context: Context):RecyclerView.Adapter<WordHolder>() {

    val listUnit:ArrayList<ReadingClass> = ArrayList<ReadingClass>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordHolder {
        return WordHolder(LayoutInflater.from(context).inflate(R.layout.word_holder,parent,false))
    }

    override fun onBindViewHolder(holder: WordHolder, position: Int) {

        holder.textUnit.text = listUnit[position].name
        holder.pictureUnit.setImageDrawable(listUnit[position].image)

//        println(">>>"+jsonProcess.reading(context,1).name)





    }

    override fun getItemCount(): Int {
        return listUnit.size
    }
}