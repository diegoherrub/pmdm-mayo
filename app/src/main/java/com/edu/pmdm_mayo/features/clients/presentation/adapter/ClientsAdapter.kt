package com.edu.pmdm_mayo.features.clients.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.edu.pmdm_mayo.R
import com.edu.pmdm_mayo.features.clients.domain.models.Client

class ClientsAdapter(
    private val clients: MutableList<Client>,
    private val onEliminarClick: (Client) -> Unit
) : RecyclerView.Adapter<ClientsAdapter.ClientsViewHolder>() {

    inner class ClientsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textDni: TextView = itemView.findViewById(R.id.textDni)
        val textNombre: TextView = itemView.findViewById(R.id.textNombre)
        val textEmail: TextView = itemView.findViewById(R.id.textEmail)
        val buttonEliminar: Button = itemView.findViewById(R.id.buttonEliminar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.clients_fragment_item, parent, false)
        return ClientsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClientsViewHolder, position: Int) {
        val client = clients[position]
        holder.textDni.text = client.dni
        holder.textNombre.text = client.name
        holder.textEmail.text = client.email
        holder.buttonEliminar.setOnClickListener {
            onEliminarClick(client)
        }
    }

    override fun getItemCount() = clients.size

    fun eliminarClients(client: Client) {
        val index = clients.indexOf(client)
        if (index != -1) {
            clients.removeAt(index)
            notifyItemRemoved(index)
        }
    }
}