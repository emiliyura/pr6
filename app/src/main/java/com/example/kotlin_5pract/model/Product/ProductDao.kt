package com.example.kotlin_5pract.model.Product

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    fun getAllProducts(): LiveData<List<Product>>

    @Insert
    fun insertProduct(product: Product)

    @Update
    fun updateProduct(product: Product)

    @Delete
    fun deleteProduct(product: Product)
}