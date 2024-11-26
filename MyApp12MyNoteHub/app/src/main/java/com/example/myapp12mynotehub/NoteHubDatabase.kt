package com.example.myapp12mynotehub

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Note::class, Category::class, Tag::class, NoteTagCrossRef::class],
    version = 1,
    exportSchema = false
)

abstract class NoteHubDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
    abstract fun categoryDao(): CategoryDao
    abstract fun tagDao(): TagDao
    abstract fun noteTagDao(): NoteTagDao
}

class CategoryDao {
    fun getAllCategories(): Any {
        TODO("Not yet implemented")

    }

    fun insert(it: Category) {
        TODO("Not yet implemented")
    }

}


