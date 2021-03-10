package com.example.essentialenglishwords

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.databinding.ActivityStoryBinding

class StoryActivity : AppCompatActivity() {

    val jsonProcess: JsonProcess = JsonProcess()
    var media: MediaPlayer = MediaPlayer()

    lateinit var storyBinding: ActivityStoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        storyBinding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(storyBinding.root)

        val positionStory = intent.getIntExtra("key", 0)

        storyBinding.imageStory.setImageDrawable(
            jsonProcess.story(
                this@StoryActivity,
                positionStory
            ).imageStory
        )

        storyBinding.textTitle.text =
            jsonProcess.story(this@StoryActivity, positionStory).titleStory

        storyBinding.textContent.text =
            Html.fromHtml(jsonProcess.story(this@StoryActivity, positionStory).messageStory)

        val story = jsonProcess.story(this@StoryActivity, positionStory)
        val path = assets.openFd(
            "data/Unit-${positionStory.plus(1)}/reading/${story.soundStory}"
        )

        storyBinding.speaker.setOnClickListener {

            if (!media.isPlaying) {
                media.setDataSource(path.fileDescriptor, path.startOffset, path.length)
                media.prepare()
                media.start()
                storyBinding.iconStartPause.setImageResource(R.drawable.pause)

            } else {
                media.reset()
                media.pause()
                storyBinding.iconStartPause.setImageResource(R.drawable.play)

            }
        }

        storyBinding.iconStartPause.setOnClickListener {
            if (media.isPlaying){
                media.pause()
                storyBinding.iconStartPause.setImageResource(R.drawable.play)

            }else{
                media.start()
                storyBinding.iconStartPause.setImageResource(R.drawable.pause)

            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        media.stop()
        media.reset()
    }
}