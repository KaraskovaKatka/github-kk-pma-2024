package com.example.myapp12mynotehub

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp12mynotehub.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var NoteAdapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //inicializace RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        NoteAdapter = NoteAdapter(emptyList())
        binding.recyclerView.adapter = NoteAdapter


    }
}