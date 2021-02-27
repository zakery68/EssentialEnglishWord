package com.example.essentialenglishwords.Process

import android.content.Context
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Json.ReadingClass
import com.example.essentialenglishwords.RecyclerView.WordsAdapter

class DataProcess(context: Context) {




    fun save(context: Context, adapter: WordsAdapter):ArrayList<ReadingClass> {

        adapter.listUnit
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
}