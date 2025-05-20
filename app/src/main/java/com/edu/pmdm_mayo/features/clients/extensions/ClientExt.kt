package com.edu.pmdm_mayo.features.clients.extensions

import com.edu.pmdm_mayo.features.clients.data.local.entities.ClientEntity
import com.edu.pmdm_mayo.features.clients.domain.models.Client

fun Client.toModel(): Client {
    return Client(
        dni = dni,
        name = name,
        email = email
    )
}

fun Client.toEntity(): ClientEntity {
    return ClientEntity(
        dni = dni,
        name = name,
        email = email
    )
}