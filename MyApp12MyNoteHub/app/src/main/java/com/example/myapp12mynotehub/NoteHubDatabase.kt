package com.example.myapp12mynotehub

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapp12mynotehub.Category
import com.example.myapp12mynotehub.CategoryDao
import com.example.myapp12mynotehub.Note
import com.example.myapp12mynotehub.NoteDao

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

