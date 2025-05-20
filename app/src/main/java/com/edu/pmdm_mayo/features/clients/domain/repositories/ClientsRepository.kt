package com.edu.pmdm_mayo.features.clients.domain.repositories

import com.edu.pmdm_mayo.features.clients.domain.models.Client

interface ClientsRepository {

    suspend fun getClients(): List<Client>

//    suspend fun addClient(client: Client)
//
//    suspend fun updateClient(client: Client)
//
//    suspend fun deleteClient(client: Client)
}