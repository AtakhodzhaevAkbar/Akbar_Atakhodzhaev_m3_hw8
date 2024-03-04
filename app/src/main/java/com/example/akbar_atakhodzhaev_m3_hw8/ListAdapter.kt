package com.example.akbar_atakhodzhaev_m3_hw8

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.akbar_atakhodzhaev_m3_hw8.databinding.ItemLayoutBinding


data class List(val name: String, val status: String,val image: Bitmap)
class ListAdapter(private val list: ArrayList<List>,
                      private val onClick: (position: Int)->Unit) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener{
            onClick(position)
        }
    }
}

class ViewHolder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: List) {
        binding.tvName.text=item.name
        binding.tvStatus.text=item.status
        binding.tvImage.setImageBitmap(item.image)
    }

}
