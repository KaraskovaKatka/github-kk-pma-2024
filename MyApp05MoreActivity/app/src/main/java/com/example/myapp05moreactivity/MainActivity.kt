package com.example.myapp05moreactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
title="Hlavní stránka"
        val btnSecond = findViewById<Button>(R.id.btnSecond)
        val etNickname = findViewById<EditText>(R.id.etNickname)

        btnSecond.setOnClickListener {
            val nickname = etNickname.text.toString() // získáme text z edit textu pole
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NICK_NAME", nickname)
            startActivity(intent)
        }



}
}