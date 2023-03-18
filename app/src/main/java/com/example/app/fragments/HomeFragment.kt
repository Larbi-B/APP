package com.example.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.app.*
import com.example.app.adapter.EventAdapter
import com.example.app.adapter.EventItemDecor

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view = inflater.inflate(R.layout.home_fragment, container, false) // ou true

        val eventList = arrayListOf<EventModel>()
        eventList.add(
            EventModel("","Football",
                Category.football,
                22,
                0,
                true))

        eventList.add(
            EventModel("","BasketBall",
                Category.basketball,
                12,
                0,
                true))

        for (e in eventList)
        {
            if (e.category == Category.football)
            {
                e.imgUrl = "https://github.com/Larbi-B/APP/blob/master/app/src/main/res/drawable-xhdpi/ic_foot.png"
            }
            else
            {
                e.imgUrl = "https://github.com/Larbi-B/APP/blob/master/app/src/main/res/drawable-xhdpi/ic_basket.png"
            }
        }

        // get recycler view

        val homeRecyclerView = view.findViewById<RecyclerView>( R.id.home_recycler_view)

        homeRecyclerView.adapter = EventAdapter (eventList)

        homeRecyclerView.addItemDecoration(EventItemDecor())


        return  view
    }

}