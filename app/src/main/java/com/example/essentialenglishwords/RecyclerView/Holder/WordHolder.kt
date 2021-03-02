package com.example.essentialenglishwords.RecyclerView.Holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.word_holder.view.*

class WordHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val imageWordItem:ImageView = itemView.imageWord

    val textWordItem:TextView = itemView.textWord

    val textPronItem:TextView = itemView.textPron

    val textDescribeItem:TextView = itemView.textDescribe

    val textExampleItem:TextView = itemView.textExample

    val speakerItem:ImageView = itemView.imageSpeaker

}