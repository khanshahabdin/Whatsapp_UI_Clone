package com.example.whatsappcloneapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_contact_custom, parent, false)  as View

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]


        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textViewname.text = ItemsViewModel.textname

        holder.textViewlastmes.text = ItemsViewModel.textrecent
        holder.textViewdate.text = ItemsViewModel.textdate

        if(holder.textViewname.text=="Haris")
        {
            holder.attachment_type.isVisible = true
            holder.attachment_type.setImageResource(ItemsViewModel.image1)
        }
        if(holder.textViewlastmes.text=="Missed voice call")
        {
            holder.attachment_type.isVisible = true
            holder.attachment_type.setImageResource(ItemsViewModel.image1)
        }
        holder.textViewstae.text = ItemsViewModel.textstate

        holder.laout.setOnClickListener {


        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.avatar_group)
        val attachment_type: ImageView = itemView.findViewById(R.id.iv_attachment_type)
        val textViewname: TextView = itemView.findViewById(R.id.tv_name)
        val textViewlastmes: TextView = itemView.findViewById(R.id.tv_last_message)
        val textViewdate: TextView = itemView.findViewById(R.id.tv_date)
        val textViewstae: TextView = itemView.findViewById(R.id.read_state)
        val laout:ConstraintLayout=itemView.findViewById(R.id.cl_root)
    }
}
