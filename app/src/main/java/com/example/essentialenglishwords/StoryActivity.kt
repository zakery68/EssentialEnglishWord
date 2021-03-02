package com.example.essentialenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.essentialenglishwords.databinding.ActivityStoryBinding

class StoryActivity : AppCompatActivity() {

    lateinit var storyBinding: ActivityStoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        storyBinding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(storyBinding.root)


    }
}