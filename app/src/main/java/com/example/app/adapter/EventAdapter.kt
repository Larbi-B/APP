package com.example.app.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app.EventModel
import com.example.app.HomeActivity
import com.example.app.R

class EventAdapter (
    private val eventList: List<EventModel>
        ) : RecyclerView.Adapter<EventAdapter.ViewHolder>(){

    class ViewHolder (view:View) : RecyclerView.ViewHolder(view){

        val eventImage = view.findViewById<ImageView>(R.id.event_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_item, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int = eventList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val currentEvent = eventList[position]

//        Glide.with(context).load(Uri.parse(currentEvent.imgUrl)).into(holder.eventImage)

    return
    }

}