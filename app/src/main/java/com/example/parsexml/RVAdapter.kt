package com.example.parsexml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items_row.view.*


class RVAdapter( var questions: ArrayList<ChannelDetils>):RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {


        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.items_row,
                parent,
                false
            )
        )


    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val text = questions[position]

        holder.itemView.apply {
            tvTitle.text = text.title

        }
    }

    override fun getItemCount() = questions.size
    fun update(data: java.util.ArrayList<ChannelDetils>) {
        this.questions = data
        notifyDataSetChanged()
    }

}