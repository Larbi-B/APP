package com.example.app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R

class EventAdapter : RecyclerView.Adapter<EventAdapter.ViewHolder>(){

    class ViewHolder (view:View) : RecyclerView.ViewHolder(view){

        val eventImage = view.findViewById<ImageView>(R.id.event_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_item, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return
    }

}