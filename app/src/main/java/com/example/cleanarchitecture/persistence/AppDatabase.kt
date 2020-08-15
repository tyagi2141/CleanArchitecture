package com.example.cleanarchitecture.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cleanarchitecture.model.AccountProperties
import com.example.cleanarchitecture.model.AuthToken

@Database(entities = [AuthToken::class, AccountProperties::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    companion object{
        val DATABASE_NAME: String = "app_db"
    }


}










