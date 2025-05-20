package com.edu.pmdm_mayo.features.clients.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clients")
class ClientEntity (
    @PrimaryKey @ColumnInfo(name = "dni") val dni: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "email") val email: String,
)