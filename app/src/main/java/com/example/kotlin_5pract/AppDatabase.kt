package com.example.kotlin_5pract

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.kotlin_5pract.model.Product.Product
import com.example.kotlin_5pract.model.Product.ProductDao


@Database(entities = [Product::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}