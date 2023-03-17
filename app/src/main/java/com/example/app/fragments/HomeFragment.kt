package com.example.app.fragments

import android.os.Bundle
import android.os.RecoverySystem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.app.R
import com.example.app.adapter.EventAdapter

class HomeFragment :Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater?.inflate(R.layout.event_frag, container, false)
        val eventRecyclerView = view?.findViewById<RecyclerView>(R.id.event_recycler_view)

        if (eventRecyclerView != null) {
            eventRecyclerView.adapter = EventAdapter()
        }
        return  view
    }

}