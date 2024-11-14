package com.example.myapp12mynotehub
import android.icu.text.CaseMap.Title
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,  // ID poznámky, automaticky generované
    val title: String,  // Název poznámky
    val content: String,  // Obsah poznámky
    val categoryId: Int? = null  // Volitelný odkaz na kategorii
)


// definujeme tabulku s názvem "note_table"
// tabulka bude mít sloupce: "id", "title", "content" a "categoryId"
// sloupce mají typy: "Int", "String", "String" a "Int"
// autoGenerate = true znamená, že sloupce "id" budou generované automaticky při vložení záznamu do tabulky
// sloupce "categoryId" jsou volné a mohou mít hodnoty "null"
// tabulka bude mít primární klíč "id" typu "Int"
// tabulka bude mít konstruktor, který bere jako parametry "id", "title", "content" a "categoryId"
//

