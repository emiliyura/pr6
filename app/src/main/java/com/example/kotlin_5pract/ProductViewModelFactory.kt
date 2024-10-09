package com.example.kolin_5pract

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_5pract.AppDatabase
import com.example.kotlin_5pract.model.Product.ProductRepository
import com.example.kotlin_5pract.ProductViewModel
import com.example.kotlin_5pract.api.ProductApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

//class ProductViewModelFactory (private val application: Application) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(ProductViewModel::class.java)) {
//            val productDao = AppDatabase.getDatabase(application).productDao()
//            val repository = ProductRepository(productDao)
//            @Suppress("UNCHECKED_CAST")
//            return ProductViewModel(repository) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}


