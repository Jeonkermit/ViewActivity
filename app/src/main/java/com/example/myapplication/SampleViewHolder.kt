package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textview = itemView.findViewById<TextView>(R.id.text_view)
}