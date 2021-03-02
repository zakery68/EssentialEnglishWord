package com.example.essentialenglishwords.RecyclerView.Holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.unit_holder.view.*
import kotlinx.android.synthetic.main.word_holder.view.*

class UnitHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val pictureUnit: ImageView = itemView.pictureUnit

    val lockUnit: ImageView = itemView.lockUnit

    val textUnit: TextView = itemView.textUnit

    val rootItem: ConstraintLayout = itemView.rootItemView
}