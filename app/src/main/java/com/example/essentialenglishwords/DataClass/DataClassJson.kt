package com.example.essentialenglishwords.DataClass

import android.graphics.drawable.Drawable
import android.media.MediaActionSound
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
    val example: String,
    val sound: String
)

data class StoryClass(
    val imageStory: Drawable,
    val titleStory: String,
    val messageStory:String
)

data class ExerciseClass(
    val title1:String,
    val exercise1:String,
    val title2:String,
    val exercise2:String,
    val title3:String,
    val answer:String,

)