package com.example.myapp05moreactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val twInfo = findViewById<TextView>(R.id.twInfo)


        //načtení dat z internetu
        val nickname = intent.getStringExtra("NICK_NAME")
        twInfo.text = nickname
        twInfo.text = "data z první aktivity je: $nickname"


        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}