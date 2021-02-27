package com.example.essentialenglishwords

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.essentialenglishwords.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
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