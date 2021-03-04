package com.example.essentialenglishwords.RecyclerView.Adapter

import android.content.Context
import android.text.Html
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

        holder.imageWordItem.setImageDrawable(listWords[position].image)

        holder.textWordItem.text =listWords[position].word

        holder.textPronItem.text = listWords[position].pron

        holder.textDescribeItem.text = Html.fromHtml(listWords[position].describe,Html.FROM_HTML_MODE_COMPACT)
        
        holder.textExampleItem.text = Html.fromHtml(listWords[position].example,Html.FROM_HTML_MODE_COMPACT)
    }

    override fun getItemCount(): Int {

        return listWords.size
    }
}