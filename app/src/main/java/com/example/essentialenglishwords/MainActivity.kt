package com.example.essentialenglishwords

import android.content.Context
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Json.Reading
import com.example.essentialenglishwords.RecyclerView.WordsAdapter
import com.example.essentialenglishwords.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    val jsonProcess:JsonProcess= JsonProcess()

    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        fun reading(context: Context, index:Int): Reading {

            val json=context.assets.open("data/data.json").bufferedReader().readText()

            println(">>>$json")

            val arrayjson= JSONObject(json).getJSONArray("flashcard")

            println(">>>$arrayjson")

            val aaa=arrayjson.getJSONObject(0)

            println(">>>>$aaa")

            val bbb=aaa.getJSONArray("reading")

            println(">>>$bbb")

            val ccc=bbb.getJSONObject(0)

            val imageUnit=ccc.getString("image")
            val nameUnit=ccc.getString("en")

            println(">>>$nameUnit")

            val imagePath=context.assets.open("data/$aaa/reading/$imageUnit").read()

            println(">>>$imagePath")
            val imageBytes = Base64.decode(imageUnit, Base64.DEFAULT)
            val decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0,20)









            return Reading(imagePath,nameUnit)
            mainBinding.image.setImageBitmap(decodedImage)

        }


        val adapter:WordsAdapter= WordsAdapter(this@MainActivity)

        mainBinding.recyclerView.layoutManager=LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)

        mainBinding.recyclerView.adapter=adapter

        adapter.notifyDataSetChanged()

    }
}