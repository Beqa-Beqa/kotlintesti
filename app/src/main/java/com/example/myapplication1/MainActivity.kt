package com.example.myapplication1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_main)
        val editText = findViewById<EditText>(R.id.name_text)
        button.setOnClickListener {
            val nameText = editText.text.toString()
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("name", nameText)
            }
            startActivity(intent)
        }
    }
}