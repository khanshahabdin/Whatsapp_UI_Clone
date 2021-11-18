package com.example.whatsappcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Chats : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chats, container, false)
        val recyclerview = view.findViewById(R.id.recyleview) as RecyclerView
        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        /*for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.profile, "Item " + i))
        }*/
        data.add(ItemsViewModel(R.drawable.profile,R.drawable.img_1, "Shahabdin","Aoa","1:02 pm","2"))
        data.add(ItemsViewModel(R.drawable.hassan,R.drawable.img_1, "Hasan","hi","Today","1"))
        data.add(ItemsViewModel(R.drawable.haris,R.drawable.seen, "Haris","good","15/11/2021","8"))
        data.add(ItemsViewModel(R.drawable.haseeb,R.drawable.img_1, "Abdul haseeb ","Missed voice call","Yesterday","3"))
        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
        return view
    }


}