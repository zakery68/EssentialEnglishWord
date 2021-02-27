package com.example.essentialenglishwords

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.essentialenglishwords.databinding.LayoutMainBinding

class Main : AppCompatActivity() {

    lateinit var mainBinding: LayoutMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = LayoutMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val videoView = mainBinding.videoView
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.logo_sun)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

        Handler(Looper.getMainLooper()).postDelayed({
            finish()
            startActivity(Intent(this,LoginActivity::class.java))
        }, 7100)

    }
}