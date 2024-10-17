package com.example.myapp06toastsnackbar

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp06toastsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializace ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Nastavení akce pro tlačítko Toast
        binding.btnShowToast.setOnClickListener {
            val toast = Toast.makeText(this, "Nazdar - mám hlad", Toast.LENGTH_LONG)
            toast.show()
        }

        // Nastavení akce pro tlačítko Snackbar
        binding.sbtShowSnackbar.setOnClickListener {
            Snackbar.make(binding.root, "já jsem Snackbar", Snackbar.LENGTH_LONG)
               // Nastavení akce pro Snakebar
                .setDuration(7000)
                .setAction("zavřít") {
                    Toast.makeText(this, "zavírám Snackbar", Toast.LENGTH_SHORT).show()
                }

            .show()
        }

    }}