package com.edu.pmdm_mayo.features.clients.data.remote.repository

import com.edu.pmdm_mayo.features.clients.data.local.entities.ClientEntity

class RemoteMockData {

    fun getMockClients(): List<ClientEntity> {
        return listOf(
            ClientEntity("12345678A", "Juan Pérez", "juan@perez.es"),
            ClientEntity("87654321B", "María López", "maria@lopez.es"),
            ClientEntity("11223344C", "Pedro García", "pedro@garcia.es"),
            ClientEntity("44332211D", "Ana Martínez", "ana@martinez.es"),
            ClientEntity("55667788E", "Luis Fernández", "luis@fernandez.es"),
            ClientEntity("99887766F", "Laura Sánchez", "laura@sanchez.es"),
            ClientEntity("22334455G", "Javier Romero", "javier@romero.es"),
            ClientEntity("33445566H", "Sara Torres", "sara@torres.es"),
            ClientEntity("44556677I", "David Ruiz", "david@ruiz.es"),
            ClientEntity("55667788J", "Carmen Díaz", "carmen@diaz.es"),
            ClientEntity("66778899K", "Antonio Morales", "antonio@morales.es"),
            ClientEntity("77889900L", "Isabel Jiménez", "isabel@jimenez.es"),
            ClientEntity("88990011M", "Francisco Castro", "francisco@castro.es"),
            ClientEntity("99001122N", "Patricia Ortega", "patricia@ortega.es"),
            ClientEntity("10111213O", "Fernando Delgado", "fernando@delgado.es"),
            ClientEntity("12131415P", "Elena Herrera", "elena@herrera.es"),
            ClientEntity("13141516Q", "Raúl Romero", "raul@romero.es"),
            ClientEntity("14151617R", "Cristina Ruiz", "cristina@ruiz.es"),
            ClientEntity("15161718S", "Alberto Torres", "alberto@torres.es"),
            ClientEntity("16171819T", "Marta Sánchez", "marta@sanchez.es"),
        )
    }
}