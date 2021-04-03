package com.example.essentialenglishwords

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.essentialenglishwords.databinding.LayoutMainBinding

class Main : AppCompatActivity() {

    lateinit var mainBinding: LayoutMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = LayoutMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            finish()
            startActivity(Intent(this,MainActivity::class.java))
        }, 2000)

    }
}