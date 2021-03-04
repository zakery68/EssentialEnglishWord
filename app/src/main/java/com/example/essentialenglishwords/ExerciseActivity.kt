package com.example.essentialenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {

    private val jsonProcess: JsonProcess = JsonProcess()

    lateinit var exerciseBinding: ActivityExerciseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        exerciseBinding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(exerciseBinding.root)

        val positionUnit = intent.getIntExtra("key", 0)

    }
}