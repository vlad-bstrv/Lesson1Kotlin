package com.vladbstrv.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.vladbstrv.lesson1.R

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tv_test)
        button = findViewById(R.id.btn_test)
        button.setOnClickListener {
            val weather = Weather()
            textView.text = weather.town
        }

        findViewById<Button>(R.id.btn_object_text).setOnClickListener {
            textView.text = Repo.getText()
        }

        cycleTest()
    }

    fun cycleTest() {
        val list = arrayListOf("a", "b", "c", "d")

        for(i in list) {
            println(i)
        }

        for(i in 1..10 step 2) {
            println("hello " + i)
        }
    }
}