package com.example.myapp12mynotehub

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    // Vloží novou poznámku do databáze
    @Insert
    suspend fun insert(note: Note)

    // Aktualizuje existující poznámku
    @Update
    suspend fun update(note: Note)

    // Smaže zadanou poznámku
    @Delete
    suspend fun delete(note: Note)

    // Načte všechny poznámky a vrátí je jako Flow, které umožňuje pozorování změn
    @Query("SELECT * FROM note_table ORDER BY id DESC")
    fun getAllNotes(): Flow<List<Note>>

}

// Definice DAO pro práci s poznámkami
// DAO je objekt, který obsahuje metody pro interakci s databází
//