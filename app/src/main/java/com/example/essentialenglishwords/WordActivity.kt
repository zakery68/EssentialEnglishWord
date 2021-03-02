package com.example.essentialenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Process.DataProcess
import com.example.essentialenglishwords.RecyclerView.Adapter.WordAdapter
import com.example.essentialenglishwords.databinding.ActivityWordBinding

class WordActivity : AppCompatActivity() {

    val wordAdapter = WordAdapter(this)
    val dataProcess: DataProcess = DataProcess(this@WordActivity)
    val jsonProcess:JsonProcess=JsonProcess()


    lateinit var wordBinding: ActivityWordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        wordBinding = ActivityWordBinding.inflate(layoutInflater)
        setContentView(wordBinding.root)

        val intent = intent.getIntExtra("key",0)

        jsonProcess.wordList(this@WordActivity,intent)

        dataProcess.fillWords(this@WordActivity,wordAdapter)
        wordBinding.recyclerViewWords.layoutManager = LinearLayoutManager(
            this@WordActivity,
            LinearLayoutManager.VERTICAL,
            false
        )

        wordBinding.recyclerViewWords.adapter = wordAdapter

    }
}