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


class WordAdapter(val context: Context) : RecyclerView.Adapter<WordHolder>() {

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

        //val sound = context.assets.open("data/Unit-1/wordlist/23060.mp3").readBytes()

        //val son = context.getFileStreamPath(context.assets.locales)

        holder.speakerItem.setOnClickListener {
//
            val path = context.assets.openFd("data/Unit-1/wordlist/23061.mp3")
            media.setDataSource(path/*, path.declaredLength, path.length*/)

            if (!media.isPlaying) {

                media.prepare()
                media.start()
            }

            println(">>>> media playing")

            println(">>>> ${media.duration}")
            Handler().postDelayed(Runnable {
                media.stop()
                media.release()
                //path.close()
                println(">>>> media close")

            }, media.duration.toLong())

//                val myUri: Uri = Uri.fromFile(son)
//                media = MediaPlayer().apply {
//                    setAudioAttributes(
//                        AudioAttributes.Builder()
//                            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                            .setUsage(AudioAttributes.USAGE_MEDIA)
//                            .build()
//                    )
//                    setDataSource(context, myUri)
//                    prepare()
//                    start()
//                }
        }
    }

    override fun getItemCount(): Int {

        return listWords.size
    }
}