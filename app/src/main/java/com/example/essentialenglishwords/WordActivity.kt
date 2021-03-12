package com.example.essentialenglishwords

import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.RecyclerView.Adapter.TransferDataWord
import com.example.essentialenglishwords.RecyclerView.Adapter.WordAdapter
import com.example.essentialenglishwords.databinding.ActivityWordBinding

class WordActivity : AppCompatActivity(), TransferDataWord {

    private val wordAdapter = WordAdapter(this, this)
    private val jsonProcess: JsonProcess = JsonProcess()
    private var positionUnit: Int = 0
    var media: MediaPlayer = MediaPlayer()

    lateinit var wordBinding: ActivityWordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        wordBinding = ActivityWordBinding.inflate(layoutInflater)
        setContentView(wordBinding.root)

        positionUnit = intent.getIntExtra("key", 0)

        val allListWords = jsonProcess.wordList(this@WordActivity, positionUnit)

        wordBinding.recyclerViewWords.layoutManager = LinearLayoutManager(
            this@WordActivity,
            LinearLayoutManager.VERTICAL,
            false
        )

        wordAdapter.listWords.addAll(allListWords)

        wordBinding.recyclerViewWords.adapter = wordAdapter

    }

    override fun notifyDataForTransferWord(position: Int) {

        val wordList = jsonProcess.wordList(this@WordActivity, positionUnit)
        val path = assets.openFd(
            "data/Unit-${positionUnit.plus(1)}/wordlist/${wordList[position].sound}"
        )

        wordBinding.textWordView.text = wordList[position].word

        media.reset()
        playOrPause(path)

        wordBinding.iconStartPause.setOnClickListener {

            playOrPause(path)

        }

    }

    private fun playOrPause(path: AssetFileDescriptor) {
        if (!media.isPlaying) {
            media.reset()
            media.setDataSource(path.fileDescriptor, path.startOffset, path.length)
            media.prepare()
            media.start()
            wordBinding.iconStartPause.setImageResource(R.drawable.pause)

        } else {
            media.reset()
            wordBinding.iconStartPause.setImageResource(R.drawable.play)
        }
    }

    override fun onPause() {
        super.onPause()
        media.stop()
        media.reset()
    }
}
