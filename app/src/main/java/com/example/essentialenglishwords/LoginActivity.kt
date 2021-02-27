package com.example.essentialenglishwords

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


    }
}