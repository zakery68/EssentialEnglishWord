package com.example.essentialenglishwords.Json

import android.content.Context
import android.graphics.drawable.Drawable
import com.example.essentialenglishwords.DataClass.ExerciseClass
import com.example.essentialenglishwords.DataClass.ReadingClass
import com.example.essentialenglishwords.DataClass.StoryClass
import com.example.essentialenglishwords.DataClass.WordsClass
import org.json.JSONObject


class JsonProcess {

    fun wordList(context: Context, positionUnit: Int): ArrayList<WordsClass> {

        val json = context.assets.open("data/data.json").bufferedReader().readText()

        val arrayJson = JSONObject(json).getJSONArray("flashcard")

        val flashCardObject = arrayJson.getJSONObject(positionUnit)

        val wordArray = flashCardObject.getJSONArray("wordlist")

        val allListWords: ArrayList<WordsClass> = ArrayList<WordsClass>()

        for (index in 0..19) {
            val wordObject = wordArray.getJSONObject(index)
            val image = wordObject.getString("image")
            val word = wordObject.getString("en")
            val pron = wordObject.getString("pron")
            val describe = wordObject.getString("desc")
            val example = wordObject.getString("exam")
            val sound = wordObject.getString("sound")

            val imagePath = context.assets.open("data/Unit-${positionUnit.plus(1)}/wordlist/$image")
            val img = Drawable.createFromStream(imagePath, null)

            allListWords.add(WordsClass(img, word, pron, describe, example,sound))

        }
        return allListWords

    }

    fun reading(context: Context, index: Int): ReadingClass {

        val json = context.assets.open("data/data.json").bufferedReader().readText()


        val arrayjson = JSONObject(json).getJSONArray("flashcard")


        val flashcardObject = arrayjson.getJSONObject(index)

        val sizeFlash = arrayjson.length()

        println(">>>$sizeFlash")


        val readingArray = flashcardObject.getJSONArray("reading")

        println(">>>$readingArray")

        val readingObject = readingArray.getJSONObject(0)

        val imageUnit = readingObject.getString("image")
        val nameUnit = readingObject.getString("en")


        val imagePath = context.assets.open("data/Unit-${index.plus(1)}/reading/$imageUnit")
        val amg = Drawable.createFromStream(imagePath, null)


        return ReadingClass(amg, nameUnit)

    }

    fun exercise(context: Context, positionStory: Int): ExerciseClass {

        val json = context.assets.open("data/data.json").bufferedReader().readText()

        val objectUnit = JSONObject(json).getJSONArray("flashcard").getJSONObject(positionStory)

        val objectExercise1 = objectUnit.getJSONArray("exercise").getJSONObject(0)
        val titleExercise1 = objectExercise1.getString("en")
        val exercise1 = objectExercise1.getString("story")

        val objectExercise2 = objectUnit.getJSONArray("exercise").getJSONObject(1)
        val titleExercise2 = objectExercise1.getString("en")
        val exercise2 = objectExercise1.getString("story")

        val objectAnswerExercise = objectUnit.getJSONArray("exercise").getJSONObject(2)
        val titleAnswer = objectExercise1.getString("en")
        val answer = objectExercise1.getString("story")

        return ExerciseClass(
            titleExercise1,
            exercise1,
            titleExercise2,
            exercise2,titleAnswer,answer
        )

    }

    fun story(context: Context, positionStory: Int): StoryClass {

        val json = context.assets.open("data/data.json").bufferedReader().readText()

        val objectUnit = JSONObject(json).getJSONArray("flashcard").getJSONObject(positionStory)

        val objectStory = objectUnit.getJSONArray("reading").getJSONObject(0)

        val titleStory = objectStory.getString("en")

        val messageStory = objectStory.getString("story")

        val imageStory = objectStory.getString("image")

        val imagePath =
            context.assets.open("data/Unit-${positionStory.plus(1)}/reading/$imageStory")

        val img = Drawable.createFromStream(imagePath, null)

        return StoryClass(img, titleStory, messageStory)
    }

}