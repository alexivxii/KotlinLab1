package com.example.firstapptry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class NewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)

        val buttonClick = findViewById<Button>(R.id.backPageButton)
        buttonClick.setOnClickListener {
            onBackPressed();
        }

    }
}