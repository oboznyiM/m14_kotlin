package com.example.class3_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*


class ImagesAdapter(private val src: Array<String>) : RecyclerView.Adapter<ImagesAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MainViewHolder(inflater.inflate(R.layout.rv_item, parent, false))
    }

    override fun getItemCount() = src.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.img.setImageResource(R.drawable.im)
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.mainIm!!
    }
}