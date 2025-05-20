package com.edu.pmdm_mayo.features.clients.data.local.repository

import com.edu.pmdm_mayo.features.clients.data.local.entities.ClientDao
import com.edu.pmdm_mayo.features.clients.data.local.entities.ClientEntity
import com.edu.pmdm_mayo.features.clients.domain.models.Client
import org.koin.core.annotation.Single

@Single
class ClientsLocalDataRepository(
    private val clientDao: ClientDao,
) {
    suspend fun getClients(): List<Client> {
        return emptyList()
    }

    suspend fun insertClients(clients: List<ClientEntity>) {
        clientDao.insertClient(*clients.toTypedArray())
    }

}