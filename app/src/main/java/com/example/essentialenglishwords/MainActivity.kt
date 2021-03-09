package com.example.essentialenglishwords

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.essentialenglishwords.Process.DataProcess
import com.example.essentialenglishwords.RecyclerView.Adapter.TransferDataUnit
import com.example.essentialenglishwords.RecyclerView.Adapter.UnitAdapter
import com.example.essentialenglishwords.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(),TransferDataUnit {

    private val dataProcess:DataProcess=DataProcess()
    private val adapter: UnitAdapter = UnitAdapter(this@MainActivity,this@MainActivity)

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

    override fun notifyDataForTransferUnit(position: Int) {

        val intent=Intent(this@MainActivity,UnitPage::class.java)
        intent.putExtra("key",position)
        startActivity(intent)
    }

}