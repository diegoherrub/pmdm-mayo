package com.edu.pmdm_mayo.features.clients.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.edu.pmdm_mayo.R
import com.edu.pmdm_mayo.databinding.ClientsFragmentBinding
import com.edu.pmdm_mayo.features.clients.presentation.adapter.ClientsAdapter

class ClientsFragment : Fragment() {

    private var _binding: ClientsFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ClientsAdapter


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
        binding.toolbar.title = "Clients"
        binding.toolbar.inflateMenu(R.menu.clients_menu)
        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_add_client -> {
                    findNavController().navigate(R.id.action_clientsFragment_to_clientFragmentAdd)
                    true
                }
                else -> false
            }
        }
    }

    private fun setupView() {
//        adapter = ClientsAdapter(clientsList) { client ->
//            adapter.eliminarClients(client)
//            // Aquí puedes agregar lógica para eliminar de la base de datos si es necesario
//        }
//        binding.adapter = adapter

    }
}