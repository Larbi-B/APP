package com.example.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.app.EventModel
import com.example.app.HomeActivity
import com.example.app.R
import com.example.app.adapter.EventAdapter
import com.example.app.adapter.EventItemDecor

class HomeFragment(
    private val context:HomeActivity,
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view = inflater.inflate(R.layout.home_fragment, container, false) // ou true
        // get recycler view

        val listEvents = arrayListOf<EventModel>()
        val footballUrl = "https://cdn.pixabay.com/photo/2013/07/13/10/51/football-157930_960_720.png"
        val basketBallUrl = "https://cdn.pixabay.com/photo/2013/07/12/14/07/basketball-147794_960_720.png"
        listEvents.add(EventModel(
            "Footbal",
            "",
            footballUrl,
            15,
            20,
            true
        ))


        listEvents.add(EventModel(
            "Footbal",
            "",
            "",
            15,
            20,
            true
        ))

        for (e in listEvents)
        {
            if (e.catégory == "football")
            {
                e.imgUrl = footballUrl
            }
            else
            {
                e.imgUrl = basketBallUrl
            }

        }




        val homeRecyclerView = view.findViewById<RecyclerView>(R.id.home_recycler_view)

        homeRecyclerView.adapter = EventAdapter (context, listEvents)

        homeRecyclerView.addItemDecoration(EventItemDecor())



        return  view
    }

}