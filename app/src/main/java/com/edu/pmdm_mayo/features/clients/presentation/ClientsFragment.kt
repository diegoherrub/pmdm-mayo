package com.edu.pmdm_mayo.features.clients.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.edu.pmdm_mayo.R
import com.edu.pmdm_mayo.databinding.ClientsFragmentBinding
import com.edu.pmdm_mayo.features.clients.domain.models.Client
import com.edu.pmdm_mayo.features.clients.presentation.adapter.ClientsAdapter

class ClientsFragment : Fragment() {

    private var _binding: ClientsFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ClientsAdapter

    private val clientsList = mutableListOf<Client>(
        Client("12345678A", "Juan Pérez", "juan@perez.es"),
        Client("87654321B", "María López", "maria@lopez.es"),
        Client("11223344C", "Pedro García", "pedro@garcia.es"),
        Client("44332211D", "Ana Martínez", "ana@martinez.es"),
        Client("55667788E", "Luis Fernández", "luis@fernandez.es"),
        Client("99887766F", "Laura Sánchez", "laura@sanchez.es"),
        Client("22334455G", "Javier Romero", "javier@romero.es"),
        Client("33445566H", "Sara Torres", "sara@torres.es"),
        Client("44556677I", "David Ruiz", "david@ruiz.es"),
        Client("55667788J", "Carmen Díaz", "carmen@diaz.es"),
        Client("66778899K", "Antonio Morales", "antonio@morales.es"),
        Client("77889900L", "Isabel Jiménez", "isabel@jimenez.es"),
        Client("88990011M", "Francisco Castro", "francisco@castro.es"),
        Client("99001122N", "Patricia Ortega", "patricia@ortega.es"),
        Client("10111213O", "Fernando Delgado", "fernando@delgado.es"),
        Client("12131415P", "Elena Herrera", "elena@herrera.es"),
        Client("13141516Q", "Raúl Romero", "raul@romero.es"),
        Client("14151617R", "Cristina Ruiz", "cristina@ruiz.es"),
        Client("15161718S", "Alberto Torres", "alberto@torres.es"),
        Client("16171819T", "Marta Sánchez", "marta@sanchez.es"),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ClientsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupView()
//        setupObservers()
    }

    private fun setupToolbar() {

//        binding.toolbar.inflateMenu(R.menu.clients_menu)
//        binding.toolbar.setOnMenuItemClickListener { item ->
//            when (item.itemId) {
//                R.id.action_add_client -> {
//                    findNavController().navigate(R.id.action_clientsFragment_to_clientFragmentAdd)
//                    true
//                }
//                else -> false
//            }
//        }
    }

    private fun setupView() {
//        adapter = ClientsAdapter(clientsList) { client ->
//            adapter.eliminarClients(client)
//            // Aquí puedes agregar lógica para eliminar de la base de datos si es necesario
//        }
//        binding.adapter = adapter

    }
}