package com.example.essentialenglishwords

import android.content.Context
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.essentialenglishwords.Json.JsonProcess
import com.example.essentialenglishwords.Json.Reading
import com.example.essentialenglishwords.RecyclerView.WordsAdapter
import com.example.essentialenglishwords.databinding.ActivityMainBinding
import org.json.JSONObject
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.essentialenglishwords.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val jsonProcess:JsonProcess= JsonProcess()

    lateinit var mainBinding: ActivityMainBinding

    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

//        jsonProcess.reading(applicationContext,0)


        val adapter:WordsAdapter= WordsAdapter(this@MainActivity)

        mainBinding.recyclerView.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)

        mainBinding.recyclerView.adapter=adapter



//        adapter.notifyDataSetChanged()

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