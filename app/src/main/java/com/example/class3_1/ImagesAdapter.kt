package com.example.class3_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_intro.view.*


class ImagesAdapter(private val src: Array<String>) : RecyclerView.Adapter<ImagesAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(group: ViewGroup, type: Int): MainViewHolder {
        val view = LayoutInflater.from(group.context).
                inflate(R.layout.rv_item, group, false)
        return MainViewHolder(view)
    }

    override fun getItemCount() = src.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.img.setImageResource(R.drawable.im)
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.mainIm!!
    }
}