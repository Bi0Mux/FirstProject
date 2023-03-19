package com.example.testingPC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btmClickMe = findViewById<Button>(R.id.mybutton)
        val myTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btmClickMe.setOnClickListener {
            timesClicked = timesClicked + 1

            myTextView.text =  timesClicked.toString()
            Toast.makeText(this, "Ouch!", Toast.LENGTH_LONG).show()
        }


    }
}