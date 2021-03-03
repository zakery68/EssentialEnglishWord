package com.example.essentialenglishwords

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Process.DataProcess
import com.example.essentialenglishwords.RecyclerView.Adapter.TransferData
import com.example.essentialenglishwords.RecyclerView.Adapter.UnitAdapter
import com.example.essentialenglishwords.RecyclerView.Adapter.WordAdapter
import com.example.essentialenglishwords.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(),TransferData {

    val dataProcess:DataProcess=DataProcess(this@MainActivity)
    val adapter: UnitAdapter = UnitAdapter(this@MainActivity,this@MainActivity)
    val jsonProcess:JsonProcess=JsonProcess()

    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)



//        jsonProcess.wordList(this@MainActivity,1)

        dataProcess.fillUnit(this,adapter)

        mainBinding.recyclerView.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)

        mainBinding.recyclerView.adapter=adapter


    }

    override fun notifyDataForTransfer(position: Int) {

        val intent=Intent(this@MainActivity,UnitPage::class.java)
        intent.putExtra("key",position)
        startActivity(intent)
    }

}