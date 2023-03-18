package com.example.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.adapter.EventAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view = inflater.inflate(R.layout.home_fragment, container, false) // ou true
        // get recycler view

        val homeRecyclerView = view.findViewById<RecyclerView>(R.id.home_recycler_view)

        homeRecyclerView.adapter = EventAdapter ()


        return  view
    }

}