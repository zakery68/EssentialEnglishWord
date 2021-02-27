package com.example.essentialenglishwords

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Process.DataProcess
import com.example.essentialenglishwords.RecyclerView.WordsAdapter
import com.example.essentialenglishwords.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val jsonProcess: JsonProcess = JsonProcess()


    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


        val dataProcess:DataProcess=DataProcess(this@MainActivity)

        val adapter: WordsAdapter = WordsAdapter(this@MainActivity)
        dataProcess.save(this,adapter)


        mainBinding.recyclerView.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)

        mainBinding.recyclerView.adapter=adapter





    }

}