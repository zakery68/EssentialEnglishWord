package com.example.essentialenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.databinding.ActivityUnitPageBinding

class UnitPage : AppCompatActivity() {

    val jsonProcess:JsonProcess= JsonProcess()

    lateinit var unitPageBinding: ActivityUnitPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        unitPageBinding= ActivityUnitPageBinding.inflate(layoutInflater)
        setContentView(unitPageBinding.root)

        val positionUnit=intent.getIntExtra("key",0)

        jsonProcess.reading(this@UnitPage,positionUnit)

        unitPageBinding.imageUnit.setImageDrawable(jsonProcess.reading(this@UnitPage,positionUnit).image)


    }
}