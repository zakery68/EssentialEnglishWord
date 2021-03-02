package com.example.essentialenglishwords.Process

import android.content.Context
import com.example.essentialenglishwords.DataClass.ReadingClass
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.RecyclerView.Adapter.UnitAdapter

class DataProcess(context: Context) {

    fun save(context: Context, adapter: UnitAdapter):ArrayList<ReadingClass> {

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