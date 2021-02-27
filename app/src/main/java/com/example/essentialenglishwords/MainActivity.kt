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

//        jsonProcess.reading(applicationContext,0)


        val adapter:WordsAdapter= WordsAdapter(this@MainActivity)

        mainBinding.recyclerView.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)

        mainBinding.recyclerView.adapter=adapter



//        adapter.notifyDataSetChanged()

    }
}