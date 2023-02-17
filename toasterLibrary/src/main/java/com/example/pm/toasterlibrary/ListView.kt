package com.example.pm.toasterlibrary

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class ListView: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "One", "Two", "Three",
            "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten"
        )

        var mListView = findViewById<android.widget.ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, users
        )
        mListView.adapter = arrayAdapter
    }
}
