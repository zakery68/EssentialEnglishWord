package com.example.essentialenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.essentialenglishwords.databinding.ActivityUnitPageBinding

class UnitPage : AppCompatActivity() {

    lateinit var unitPageBinding: ActivityUnitPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        unitPageBinding= ActivityUnitPageBinding.inflate(layoutInflater)
        setContentView(unitPageBinding.root)
    }
}