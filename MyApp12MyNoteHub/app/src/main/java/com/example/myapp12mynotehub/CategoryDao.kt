package com.example.myapp12mynotehub

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.myapp12mynotehub.databinding.ActivityMainBinding

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch


@Dao
interface CategoryDao() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    @Insert
    suspend fun insert(category: Category)

    @Update
    suspend fun update(category: Category)

    @Delete
    suspend fun delete(category: Category)

    @Query("SELECT * FROM category_table ORDER BY name ASC")
    fun getAllCategories(): Flow<List<Category>>

    @Query("SELECT * FROM category_table WHERE name = :categoryName LIMIT 1")
    fun getCategoryByName(categoryName: String): Category?

    @Query("SELECT * FROM category_table WHERE id = :categoryId LIMIT 1")
    fun getCategoryById(categoryId: Int): Category?
    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CategoryDao> {
        override fun createFromParcel(parcel: Parcel): CategoryDao {
            return CategoryDao(parcel)
        }

        override fun newArray(size: Int): Array<CategoryDao?> {
            return arrayOfNulls(size)
        }
    }
}