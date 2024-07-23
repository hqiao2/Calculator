package com.example.question1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReceivingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiving)

        val intent = intent
        val data = intent.getStringExtra("extra_data")

        val textView: TextView = findViewById(R.id.textView)
        textView.text = data
    }
}