package com.example.essentialenglishwords.DataClass

import android.graphics.drawable.Drawable
import android.widget.TextView

data class ReadingClass(
    val image: Drawable,
    val name: String
)

data class WordsClass(
    val image: Drawable,
    val word: String,
    val pron: String,
    val describe: String,
    val example: String
)

data class StoryClass(
    val imageStory: Drawable,
    val titleStory: String,
    val messageStory:String
)