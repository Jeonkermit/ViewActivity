package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SampleAdapter : RecyclerView.Adapter<SampleViewHolder>() {
    val list = (1..100).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        return SampleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.sample_recycler, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.textview.text = list[position].toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}