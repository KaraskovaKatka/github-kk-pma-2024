package com.example.myapplicationlinearlayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val etName = findViewById<EditText>(R.id.etName)
        val etSurname = findViewById<EditText>(R.id.etSurname)
        val etObec = findViewById<EditText>(R.id.etObec)
        val etVek = findViewById<EditText>(R.id.etVek)
        val tvInformation =findViewById<TextView>(R.id.tvInformation)

        val btnSend = findViewById<Button>(R.id.etSend),
        val btnvymazat = findViewById<Button>(R.id.etvymazat)

        //nastavení obsluhy pro tačítko odeslat
        btnSend.setOnClickListener {
            val name= etName.text.toString()
            val surname = etSurname.text.toString()
            val Obec = etObec.text.toString()
            val Vek=etVek.text.toString()

            //zobrazení textu v TextView
            val formattedText="Jmenuji se $name $surname. Je mi $etVek let a moje bydliště je $etObec"
            tvInformation.text = formattedText
        }

        //nastavení obsluhy pro tačítko vymazat
        btnvymazat.setOnClickListener {
            etName.text.clear()
            etSurname.text.clear()
            etObec.text.clear()
            etVek.text.clear()
        }
    }
}