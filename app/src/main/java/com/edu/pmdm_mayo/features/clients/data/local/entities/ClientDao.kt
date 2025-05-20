package com.edu.pmdm_mayo.features.clients.data.local.entities

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ClientDao {

    @Query("SELECT * FROM clients")
    suspend fun getClients(): List<ClientEntity>

    @Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    suspend fun insertClient(vararg clients: ClientEntity)
}