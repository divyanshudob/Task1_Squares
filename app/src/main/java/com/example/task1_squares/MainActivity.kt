package com.example.task1_squares

import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt1 = findViewById<TextView>(R.id.txt1)
        var txt2 = findViewById<TextView>(R.id.txt2)
        var txt3 = findViewById<TextView>(R.id.txt3)

        txt1.setBackgroundColor(Color.GRAY)
        txt2.setBackgroundColor(Color.CYAN)
        txt3.setBackgroundColor(Color.GREEN)
    }
}