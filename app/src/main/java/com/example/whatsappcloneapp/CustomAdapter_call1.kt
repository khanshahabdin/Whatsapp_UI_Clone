package com.example.whatsappcloneapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter_call1(private val mList: List<ItemsViewModel_call>) : RecyclerView.Adapter<CustomAdapter_call1.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_call, parent, false)  as View

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel_call = mList[position]


        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel_call.image)

        // sets the text to the textview from our itemHolder class


        holder.username.text =ItemsViewModel_call.textname
         holder.datestatus.text = ItemsViewModel_call.textdate



    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.avatar_group)
        val username: TextView = itemView.findViewById(R.id.tv_name)
        val datestatus: TextView = itemView.findViewById(R.id.tv_last_message)

    }
}
