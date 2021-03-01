package com.example.essentialenglishwords

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.essentialenglishwords.databinding.LayoutLoginBinding

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