package com.example.memorygame

import Models.User
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val name = ed1.text.toString().trim()
            val user = User(name)
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("key", user)
            startActivity(intent)
        }
    }
}