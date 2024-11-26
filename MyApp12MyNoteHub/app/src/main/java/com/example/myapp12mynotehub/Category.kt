package com.example.myapp12mynotehub
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "category_table")

data class Category(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,  // Automaticky generované ID kategorie
    val name: String  // Název kategorie
)