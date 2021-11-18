package com.example.whatsappcloneapp


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.devlomi.circularstatusview.CircularStatusView

class CustomAdapter_status2(private val mList: List<ItemsViewModel_status>,val contex : Context) : RecyclerView.Adapter<CustomAdapter_status2.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_status, parent, false)  as View

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel_status = mList[position]


        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel_status.image)

        // sets the text to the textview from our itemHolder class


        holder.username_status.text = ItemsViewModel_status.textname
         holder.datestatus.text = ItemsViewModel_status.textdate
        holder.circularStatusView.setPortionsCount(5)
        holder.circularStatusView.setPortionsColor(ContextCompat.getColor(contex,R.color.gray))



    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.thumbnail_status)
        val username_status: TextView = itemView.findViewById(R.id.username_status)
        val datestatus: TextView = itemView.findViewById(R.id.date_status)

        val circularStatusView: CircularStatusView = itemView.findViewById(R.id.circular_status_counts)


    }
}
