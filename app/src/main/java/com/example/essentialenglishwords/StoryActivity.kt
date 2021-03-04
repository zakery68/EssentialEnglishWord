package com.example.essentialenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.databinding.ActivityStoryBinding

class StoryActivity : AppCompatActivity() {

    val jsonProcess : JsonProcess = JsonProcess()

    lateinit var storyBinding: ActivityStoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        storyBinding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(storyBinding.root)


        val intent = intent.getIntExtra("key",0)


    }
}