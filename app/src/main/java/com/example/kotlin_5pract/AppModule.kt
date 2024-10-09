package com.example.kotlin_5pract

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.kotlin_5pract.model.Product.ProductDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @javax.inject.Singleton
    fun providesRecipesDb(app: Application): AppDatabase{
        return Room.databaseBuilder(app, AppDatabase::class.java, "recipe-database"
        ).build()
    }

    @Provides
    fun provideProductDao(database: AppDatabase): ProductDao {
        return database.productDao()
    }
}

