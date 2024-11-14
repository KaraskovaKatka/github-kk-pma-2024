package com.example.myapp12mynotehub

import androidx.room.Entity

@Entity(tableName = "note_tag_cross_ref", primaryKeys = ["noteId", "tagId"])

data class NoteTagCrossRef(
    val noteId: Int,  // ID poznámky
    val tagId: Int    // ID štítku
)

// Definice tabulky s názvem "note_tag_cross_ref"
// tabulka bude mít sloupce "noteId" a "tagId"
// sloupce budou mít primární klíč "noteId" a "tagId"
// tabulka bude mít konstruktor, který bere jako parametry "noteId" a "tagId"
