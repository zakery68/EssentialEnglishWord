package com.example.essentialenglishwords.RecyclerView

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.word_holder.view.*
import java.security.cert.Extension

class WordHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val pictureUnit: ImageView = itemView.pictureUnit

    val lockUnit: ImageView = itemView.lockUnit

    val textUnit: TextView = itemView.textUnit
}