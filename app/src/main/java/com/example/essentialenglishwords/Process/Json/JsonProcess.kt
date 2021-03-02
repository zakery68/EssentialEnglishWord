package com.example.essentialenglishwords.Json

import android.content.Context
import android.graphics.drawable.Drawable
import com.example.essentialenglishwords.DataClass.ReadingClass
import com.example.essentialenglishwords.DataClass.WordsClass
import org.json.JSONObject




class JsonProcess {

    fun wordList(context: Context,index: Int):WordsClass{
        val json=context.assets.open("data/data.json").bufferedReader().readText()

        val arrayJson=JSONObject(json).getJSONArray("flashcard")

        val flashCardObject=arrayJson.getJSONObject(0)

        val wordArray=flashCardObject.getJSONArray("wordlist")

        val wordObject=wordArray.getJSONObject(index)

        println(">>>>$wordObject")

        val image=wordObject.getString("image")
        val word=wordObject.getString("en")
        val pron=wordObject.getString("pron")
        val describe=wordObject.getString("desc")
        val example=wordObject.getString("exam")

        val imagePath=context.assets.open("data/Unit-${index.plus(1)}/wordlist/$image")
        val img=Drawable.createFromStream(imagePath,null)








        return WordsClass(img,word,pron,describe,example)

    }

    fun exercise(){

    }

    fun reading(context: Context,index:Int): ReadingClass {

        val json=context.assets.open("data/data.json").bufferedReader().readText()


        val arrayjson=JSONObject(json).getJSONArray("flashcard")


        val flashcardObject=arrayjson.getJSONObject(index)

        val sizeFlash=arrayjson.length()

        println(">>>$sizeFlash")


        val readingArray=flashcardObject.getJSONArray("reading")

        println(">>>$readingArray")

        val readingObject=readingArray.getJSONObject(0)

        val imageUnit=readingObject.getString("image")
        val nameUnit=readingObject.getString("en")


        val imagePath=context.assets.open("data/Unit-${index.plus(1)}/reading/$imageUnit")
        val amg=Drawable.createFromStream(imagePath,null)


        return ReadingClass(amg,nameUnit)

    }
}