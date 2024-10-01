package com.example.myapplication

import android.os.Bundle
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
        import android.os.Bundle
                import android.widget.Button
                import android.widget.EditText
                import android.widget.Toast
                import androidx.appcompat.app.AppCompatActivity

        class MainActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val jmenoHrace = findViewById<EditText>(R.id.jmeno_hrace)
                val jmenoTymu = findViewById<EditText>(R.id.jmeno_tymu)
                val jmenoSouteze = findViewById<EditText>(R.id.jmeno_souteze)
                val uspesnostposmeru = findViewById<EditText>(R.id.uspesnost_po_smeru)
                val uspesnostprotismeru = findViewById<EditText>(R.id.uspesnost_proti_smeru)
                val datum = findViewById<EditText>(R.id.datum_zapasu)
                val btnOdeslat = findViewById<Button>(R.id.odeslat)

                btnOdeslat.setOnClickListener {
                    val hrac = jmenoHrace.text.toString()
                    val tym = jmenoTymu.text.toString()
                    val soutez = jmenoSouteze.text.toString()
                    val uspesnostposmeru = uspesnost_po_smeru.text.toString()
                    val uspesnostprotismeru = uspesnost_proti_smeru.text.toString()
                    val datumZavod = datum.text.toString()

                    Toast.makeText(this, "Data odeslána:\n$hrac, $tym, $soutez, $uspesnostHod%, $datumZavod", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}