package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Připojení XML prvků z activity_main.xml
        val jmenoHrace = findViewById<EditText>(R.id.jmeno_hrace)
        val jmenoTymu = findViewById<EditText>(R.id.jmeno_tymu)
        val jmenoSouteze = findViewById<EditText>(R.id.jmeno_souteze)
        val uspesnostPoSmeru = findViewById<EditText>(R.id.uspesnost_po_smeru)
        val uspesnostProtiSmeru = findViewById<EditText>(R.id.uspesnost_proti_smeru)
        val datum = findViewById<EditText>(R.id.datum_zapasu)
        val btnOdeslat = findViewById<Button>(R.id.odeslat)

        // Nastavení OnClickListener pro tlačítko
        btnOdeslat.setOnClickListener {
            // Získání hodnot z EditText polí
            val hrac = jmenoHrace.text.toString()
            val tym = jmenoTymu.text.toString()
            val soutez = jmenoSouteze.text.toString()
            val uspesnostPoSmeruText = uspesnostPoSmeru.text.toString()
            val uspesnostProtiSmeruText = uspesnostProtiSmeru.text.toString()
            val datumZavod = datum.text.toString()

            // Kontrola, zda nejsou některá pole prázdná
            if (hrac.isEmpty() || tym.isEmpty() || soutez.isEmpty() || uspesnostPoSmeruText.isEmpty() || uspesnostProtiSmeruText.isEmpty() || datumZavod.isEmpty()) {
                Toast.makeText(this, "Vyplňte všechna pole", Toast.LENGTH_LONG).show()
            } else {
                // Zobrazení potvrzovací zprávy
                Toast.makeText(
                    this,
                    "Data odeslána:\nHráč: $hrac\nTým: $tym\nSoutěž: $soutez\nÚspěšnost po směru: $uspesnostPoSmeruText cm\nÚspěšnost proti směru: $uspesnostProtiSmeruText cm\nDatum: $datumZavod",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
