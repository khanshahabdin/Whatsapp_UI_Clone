package com.example.whatsappcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Calls : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_calls, container, false)

        val recyclerview = view.findViewById(R.id.callrecycle) as RecyclerView
        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        // ArrayList of class ItemsViewModel
        val data1 = ArrayList<ItemsViewModel_call>()
        data1.add(ItemsViewModel_call(R.drawable.haris, "Haris","Today,1:02 pm"))
        data1.add(ItemsViewModel_call(R.drawable.haseeb, "Hassan","Yesterday,12:10 pm"))
        data1.add(ItemsViewModel_call(R.drawable.hassan, "Arsalan","Yesterday,3:52 am"))
        data1.add(ItemsViewModel_call(R.drawable.profile, "Shahabdin","15/11/2021"))
        data1.add(ItemsViewModel_call(R.drawable.profile, "Shahabdin","15/11/2021"))



        val adapter = CustomAdapter_call1(data1)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


        return view
    }


}