package com.example.essentialenglishwords.Process

import android.content.Context
import com.example.essentialenglishwords.DataClass.ReadingClass
import com.example.essentialenglishwords.DataClass.WordsClass
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.RecyclerView.Adapter.UnitAdapter
import com.example.essentialenglishwords.RecyclerView.Adapter.WordAdapter

class DataProcess(context: Context) {

    fun fillUnit(context: Context, adapter: UnitAdapter):ArrayList<ReadingClass> {

//        adapter.listUnit
        val jsonProcess: JsonProcess = JsonProcess()

        for (index in 0..29) {

            adapter.listUnit.add(
                ReadingClass(
                    jsonProcess.reading(context, index).image,
                    jsonProcess.reading(context, index).name
                )
            )


        }

        return adapter.listUnit

    }

    fun fillWords(context: Context,adapter: WordAdapter):ArrayList<WordsClass> {

        val jsonProcess: JsonProcess = JsonProcess()

        for (index in 0..19){

            adapter.listWords.add(
                WordsClass(
                    jsonProcess.wordList(context,index).image,
                    jsonProcess.wordList(context,index).word,
                    jsonProcess.wordList(context,index).pron,
                    jsonProcess.wordList(context,index).describe,
                    jsonProcess.wordList(context,index).example
                )
            )
        }

        return adapter.listWords
    }

}