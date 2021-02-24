package com.example.essentialenglishwords.Json

import android.content.Context
import org.json.JSONArray
import org.json.JSONObject

class JsonProcess {

    fun wordlist(){

    }

    fun exercise(){

    }

    fun reading(context: Context){

        val json=context.assets.open("data/data.json").bufferedReader().readText()

        println(">>>$json")

        val arrayjson=JSONObject(json).getJSONArray("flashcard")

        println(">>>$arrayjson")


    }
}