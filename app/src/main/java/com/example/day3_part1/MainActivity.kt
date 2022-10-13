package com.example.day3_part1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val textView = findViewById<TextView>(R.id.textView)
        val changeButton = findViewById<Button>(R.id.button)

        changeButton.setOnClickListener(View.OnClickListener {
            val name: String = editText.text.toString()
            textView.text = "Hi There $name! This is your first Android App"
        })
    }
}