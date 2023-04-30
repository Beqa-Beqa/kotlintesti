package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("name")

        val nameText = findViewById<TextView>(R.id.text_name)
        nameText.text = "Your name is $name"

        val button = findViewById<Button>(R.id.click_me)
        button.setOnClickListener {
            finish()
        }
    }
}