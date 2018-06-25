package com.vidroid.com.br.apps.organizze.pro.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vidroid.com.br.apps.event.R
import com.vidroid.com.br.apps.event.model.Event
import org.w3c.dom.Text

class AdapterListaClientes(eventList:List<Event>): RecyclerView.Adapter<AdapterListaClientes.MyViewHolder>() {

    override fun getItemCount(): Int {
        return this.eventsList.size
    }

    private val eventsList:List<Event> = eventList

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):MyViewHolder {
        val itemEventList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.events_layout, parent, false)
        return MyViewHolder(itemEventList)
    }
    override fun onBindViewHolder(holder:MyViewHolder, position:Int) {
        val event = this.eventsList.get(position)
        holder.itemTime.setText(event.time)
        holder.itemTitle.setText(event.title)
        holder.itemSmallDescription.setText(event.smallDescription)
    }
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        internal var itemTime: TextView
        internal var itemTitle: TextView
        internal var itemSmallDescription: TextView
        init{
            itemTime = itemView.findViewById(R.id.itemTime)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemSmallDescription = itemView.findViewById(R.id.itemSmallDescription)
        }
    }
}