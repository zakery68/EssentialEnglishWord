package com.example.essentialenglishwords.Process

import android.content.Context
import android.graphics.drawable.Drawable
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Json.Reading

class DataProcess {

    fun save(context: Context,image:Drawable,name:String){

        val jsonProcess:JsonProcess= JsonProcess()

        val listUnit:ArrayList<Reading> =ArrayList<Reading>()
        for (index in 0..30){

        jsonProcess.reading(context,index)


        }



    }
}