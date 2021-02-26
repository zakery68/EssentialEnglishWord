package com.example.essentialenglishwords.Json

import android.content.Context
import org.json.JSONArray
import org.json.JSONObject

data class Reading(
    val image:Int,
    val name:String
)

class JsonProcess {

    fun wordlist(){

    }

    fun exercise(){

    }

//    fun reading(context: Context,index:Int):Reading{
//
//        val json=context.assets.open("data/data.json").bufferedReader().readText()
//
//        println(">>>$json")
//
//        val arrayjson=JSONObject(json).getJSONArray("flashcard")
//
//        println(">>>$arrayjson")
//
//        val aaa=arrayjson.getJSONObject(index)
//
//        println(">>>$aaa")
//
//        val bbb=aaa.getJSONArray("reading")
//
//        println(">>>$bbb")
//
//        val ccc=bbb.getJSONObject(0)
//
//        val imageUnit=ccc.getString("image")
//        val nameUnit=ccc.getString("en")
//
//        println(">>>$nameUnit")
//
//        val imagePath=context.assets.open("data/$aaa/reading/$imageUnit").read()
//
//        println(">>>$imagePath")
//
//
//
//
//
//
//
//        return Reading(imagePath,nameUnit)
//
//    }
}