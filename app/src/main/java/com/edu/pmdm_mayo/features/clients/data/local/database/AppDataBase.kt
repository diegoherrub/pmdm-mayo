package com.edu.pmdm_mayo.features.clients.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.edu.pmdm_mayo.features.clients.data.local.entities.ClientDao
import com.edu.pmdm_mayo.features.clients.data.local.entities.ClientEntity


@Database(
    entities = [
        ClientEntity::class
    ], version = 1, exportSchema = false
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun clientDao(): ClientDao
}