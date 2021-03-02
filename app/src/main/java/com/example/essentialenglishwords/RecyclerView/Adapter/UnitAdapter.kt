package com.example.essentialenglishwords.RecyclerView.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.Json.ReadingClass
import com.example.essentialenglishwords.R
import com.example.essentialenglishwords.RecyclerView.Holder.UnitHolder

class UnitAdapter(val context: Context):RecyclerView.Adapter<UnitHolder>() {

    val listUnit:ArrayList<ReadingClass> = ArrayList<ReadingClass>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitHolder {
        return UnitHolder(LayoutInflater.from(context).inflate(R.layout.unit_holder,parent,false))
    }

    override fun onBindViewHolder(holder: UnitHolder, position: Int) {

        holder.textUnit.text = listUnit[position].name
        holder.pictureUnit.setImageDrawable(listUnit[position].image)

        holder.rootItem.setOnClickListener {

        }

    }

    override fun getItemCount(): Int {
        return listUnit.size
    }
}