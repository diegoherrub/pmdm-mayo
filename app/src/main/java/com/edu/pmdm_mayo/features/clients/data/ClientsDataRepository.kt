package com.edu.pmdm_mayo.features.clients.data

import com.edu.pmdm_mayo.features.clients.data.local.repository.ClientsLocalDataRepository
import com.edu.pmdm_mayo.features.clients.data.remote.repository.RemoteMockData
import com.edu.pmdm_mayo.features.clients.domain.models.Client
import com.edu.pmdm_mayo.features.clients.domain.repositories.ClientsRepository
import com.edu.pmdm_mayo.features.clients.extensions.toModel
import org.koin.core.annotation.Single

@Single
class ClientsDataRepository(
    private val local: ClientsLocalDataRepository,
    private val remote: RemoteMockData
) : ClientsRepository {

    override suspend fun getClients(): List<Client> {
        var localClients = local.getClients()
        if (localClients.isEmpty()) {
            val mockClients = remote.getMockClients()
            local.insertClients(mockClients)
            localClients = local.getClients()
        }
        return localClients.map { it.toModel() }
    }

//    override suspend fun addClient(client: Client) {
//        // Aquí puedes agregar la lógica para agregar un cliente a la base de datos
//    }
//
//    override suspend fun updateClient(client: Client) {
//        // Aquí puedes agregar la lógica para actualizar un cliente en la base de datos
//    }
//
//    override suspend fun deleteClient(client: Client) {
//        // Aquí puedes agregar la lógica para eliminar un cliente de la base de datos
//    }
}