package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = (1..100).toList()

        val listView = findViewById<ListView>(R.id.list_view)
        val adapter = ArrayAdapter<Int>(
            this, android.R.layout.simple_list_item_1, list
        )

        listView.adapter = adapter

        val intent = Intent(this, RecyclerActivity::class.java)
        val recyclerButton = findViewById<Button>(R.id.recycler_button)

        recyclerButton.setOnClickListener {
            startActivity(intent)
        }
    }
}