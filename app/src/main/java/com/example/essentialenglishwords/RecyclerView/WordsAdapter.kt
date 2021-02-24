package com.example.essentialenglishwords.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.R

class WordsAdapter(val context: Context):RecyclerView.Adapter<WordHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordHolder {
        return WordHolder(LayoutInflater.from(context).inflate(R.layout.word_holder,parent,false))
    }

    override fun onBindViewHolder(holder: WordHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}