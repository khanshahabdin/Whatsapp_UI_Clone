package com.example.whatsappcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devlomi.circularstatusview.CircularStatusView
import de.hdodenhof.circleimageview.CircleImageView


class Status : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      val view  = inflater.inflate(R.layout.fragment_status, container, false)
      val mystatus = view.findViewById<CircleImageView>(R.id.avatar_user_status)
      mystatus.background=ContextCompat.getDrawable(requireContext(),R.drawable.profile)


        /*val circularStatusView = view.findViewById<CircularStatusView>(R.id.circular_status_count)
        circularStatusView.setPortionsCount(3)
        circularStatusView.setPortionsColor(ContextCompat.getColor(requireContext(),R.color.colorAccent))*/
       /* circularStatusView.setPortionsCount(statusList.size());
        circularStatusView.setPortionsColor(getResources().getColor(R.color.colorAccent););*/

        val recyclerview = view.findViewById(R.id.rv_recent_updates_status) as RecyclerView
        val recyclerview2 = view.findViewById(R.id.rv_viewed_updates_status) as RecyclerView
        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview2.layoutManager = LinearLayoutManager(requireContext())

        // ArrayList of class ItemsViewModel
        val data1 = ArrayList<ItemsViewModel_status>()
        data1.add(ItemsViewModel_status(R.drawable.urraan, "Shahabdin","Today,1:02 pm"))
        data1.add(ItemsViewModel_status(R.drawable.urraan, "Amjed","Today,11:08 pm"))
        data1.add(ItemsViewModel_status(R.drawable.urraan, "Talha","Today,8:02 am"))
        data1.add(ItemsViewModel_status(R.drawable.urraan, "Habib","Today,4:40 pm"))

        val data2 = ArrayList<ItemsViewModel_status>()
        data2.add(ItemsViewModel_status(R.drawable.haris, "Haris","Today,1:02 pm"))
        data2.add(ItemsViewModel_status(R.drawable.haseeb, "Hassan","Yesterday,12:10 pm"))
        data2.add(ItemsViewModel_status(R.drawable.hassan, "Arsalan","Yesterday,3:52 am"))


        val adapter = CustomAdapter_status1(data1,requireContext())
        val adapter2 = CustomAdapter_status2(data2,requireContext())

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
        recyclerview2.adapter = adapter2
        return view


    }


}