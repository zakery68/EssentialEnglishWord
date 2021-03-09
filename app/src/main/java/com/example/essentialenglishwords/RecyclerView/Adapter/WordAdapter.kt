package com.example.essentialenglishwords.RecyclerView.Adapter

import android.content.Context
import android.media.MediaPlayer
import android.os.Handler
import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.DataClass.WordsClass
import com.example.essentialenglishwords.R
import com.example.essentialenglishwords.RecyclerView.Holder.WordHolder

interface TransferDataWord {
    fun notifyDataForTransferWord(position: Int)
}

class WordAdapter(val context: Context, val transferDataWord: TransferDataWord) :
    RecyclerView.Adapter<WordHolder>() {

    val listWords: ArrayList<WordsClass> = ArrayList<WordsClass>()

    var media: MediaPlayer = MediaPlayer()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordHolder {

        return WordHolder(
            LayoutInflater.from(context).inflate(
                R.layout.word_holder,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: WordHolder, position: Int) {

        holder.imageWordItem.setImageDrawable(listWords[position].image)

        holder.textWordItem.text = listWords[position].word

        holder.textPronItem.text = listWords[position].pron

        holder.textDescribeItem.text =
            Html.fromHtml(listWords[position].describe, Html.FROM_HTML_MODE_COMPACT)

        holder.textExampleItem.text =
            Html.fromHtml(listWords[position].example, Html.FROM_HTML_MODE_COMPACT)

        holder.speakerItem.setOnClickListener {

            transferDataWord.notifyDataForTransferWord(position)

        }


    }

    override fun getItemCount(): Int {

        return listWords.size
    }
}