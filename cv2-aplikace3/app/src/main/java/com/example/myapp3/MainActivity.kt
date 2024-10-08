package com.example.myapp004objednavka

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp004objednavka.dataBinding.ActivityMainBinding
import com.example.myapp3.R
import com.example.myapp3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()


        // binding settings
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Objednávka kola"

        binding.btnObjednavka.setOnClickListener {

            // načtení ID vybraného radioButtonu z radioGroup
            val koloRbId = binding.rgKaktus.checkedRadioButtonId

            val kolo = findViewById<RadioButton>(koloRbId)

            val Velikost = binding.cbVelikost.isChecked
            val Tvar = binding.cbTvar.isChecked
            val Vzhled = binding.cbVzhled.isChecked

            val objednavkaText = "Souhrn objednávky: " +
                    "${Kaktus.text}" +
                    (if(Velikost) "; malý kulatý pichlavý" else "") +
                    (if(Tvar) "; víc šišatý a pichlavý " else "") +
                    (if(Vzhled) "; hladký, vysoký, elegantní" else "")

            binding.tvObjednavka.text = objednavkaText

        }

        // Změna obrázku v závislosti na vybraném radioButtonu

        binding.rbKaktus1.setOnClickListener {
            binding.ivKaktus.setImageResource(R.drawable.kaktus1)
        }

        binding.rbKaktus2.setOnClickListener {
            binding.ivKaktus.setImageResource(R.drawable.kaktus2)
        }

        binding.rbKaktus3.setOnClickListener {
            binding.ivKaktus.setImageResource(R.drawable.kaktus3)
        }

    }


}