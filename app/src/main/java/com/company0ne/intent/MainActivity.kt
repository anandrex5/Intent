package com.company0ne.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.company0ne.SecondActivity

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edittextName)
        age = findViewById(R.id.edittextAge)
        send = findViewById(R.id.buttonSend)

        send.setOnClickListener {

            //set the which you want to pass
            var userName: String = name.text.toString()
            var userAge: Int = age.text.toString().toInt()

            //pass the data
            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("userName", userName)
            intent.putExtra("userAge", userAge)
            startActivity(intent)


        }
    }
}