package com.example.essentialenglishwords.RecyclerView.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.DataClass.WordsClass
import com.example.essentialenglishwords.R
import com.example.essentialenglishwords.RecyclerView.Holder.WordHolder


class WordAdapter(val context: Context) : RecyclerView.Adapter<WordHolder>() {

    val listWords:ArrayList<WordsClass> = ArrayList<WordsClass>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordHolder {

        return WordHolder(
            LayoutInflater.from(context).inflate(
                R.layout.word_holder,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: WordHolder, position: Int) {

    }

    override fun getItemCount(): Int {

        return listWords.size
    }
}