package com.example.essentialenglishwords.Json

import android.content.Context
import android.graphics.drawable.Drawable
import org.json.JSONObject

data class Reading(
    val image:Drawable,
    val name:String
)

class JsonProcess {

    fun wordlist(){

    }

    fun exercise(){

    }

    fun reading(context: Context,index:Int):Reading{

        val json=context.assets.open("data/data.json").bufferedReader().readText()


        val arrayjson=JSONObject(json).getJSONArray("flashcard")


        val flashcardObject=arrayjson.getJSONObject(0)

        val sizeFlash=arrayjson.length()

        println(">>>$sizeFlash")


        val readingArray=flashcardObject.getJSONArray("reading")

        println(">>>$readingArray")

        val readingObject=readingArray.getJSONObject(1)

        val imageUnit=readingObject.getString("image")
        val nameUnit=readingObject.getString("en")


        val imagePath=context.assets.open("data/Unit-$index/reading/$imageUnit")
        val amg=Drawable.createFromStream(imagePath,null)










        return Reading(amg,nameUnit)

    }
}