package com.example.essentialenglishwords

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.essentialenglishwords.databinding.LayoutLoginBinding
import org.json.JSONObject
import java.io.InputStream

class LoginActivity : AppCompatActivity() {

    lateinit var loginBinding: LayoutLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = LayoutLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.buttonLogin.setOnClickListener {
            startActivity(Intent(this@LoginActivity,MainActivity::class.java))
        }

    }
}