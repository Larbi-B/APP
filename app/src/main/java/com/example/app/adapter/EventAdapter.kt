package com.example.app.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app.EventModel
import com.example.app.HomeActivity
import com.example.app.R

class EventAdapter (
    private val context : HomeActivity,
    private val listEvent: List<EventModel>
        ) : RecyclerView.Adapter<EventAdapter.ViewHolder>(){

    class ViewHolder (view:View) : RecyclerView.ViewHolder(view){

        // récupérer views by id pour les modifier
        val eventImage = view.findViewById<ImageView>(R.id.event_image)
        val eventName = view.findViewById<TextView>(R.id.event_name)
        val eventAdresse = view.findViewById<TextView>(R.id.event_adresse)
        val nb_max = view.findViewById<TextView>(R.id.nb_max)
        val nb_joins = view.findViewById<TextView>(R.id.nb_joins)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_item, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int = listEvent.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentEvent = listEvent[position]

        Glide.with(context).load(Uri.parse(currentEvent.imgUrl)).into(holder.eventImage)

//        holder.eventAdresse = currentEvent.adresse
        holder.eventName.text = currentEvent.name
        holder.nb_max.text = currentEvent.nombreMax.toString()
        holder.nb_joins.text = currentEvent.nombrJoins.toString()
        holder.eventAdresse.text = currentEvent.adresse

    }

}