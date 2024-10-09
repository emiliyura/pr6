package com.example.kotlin_5pract.model.Product

import androidx.lifecycle.LiveData
import javax.inject.Inject

class ProductRepository @Inject constructor(private val productDao: ProductDao) {
    val allProducts: LiveData<List<Product>> = productDao.getAllProducts()

    suspend fun insert(product: Product) {
        productDao.insertProduct(product)
    }

    suspend fun update(product: Product) {
        productDao.updateProduct(product)
    }

    suspend fun delete(product: Product) {
        productDao.deleteProduct(product)
    }
}


