package com.company0ne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.widget.TextView
import com.company0ne.intent.R

class SecondActivity : AppCompatActivity() {

    lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        result = findViewById(R.id.textView1)


        //retrieving the data
        var userName: String = intent.getStringExtra("userName").toString()
        var userAge: Int = intent.getIntExtra("userAge", 0)

        result.text = "My name is $userName and my age is $userAge"
    }
}