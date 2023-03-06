package com.example.pm.rsrsdk

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListView: AppCompatActivity() {
    var dummyList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        val arrayAdapter: ArrayAdapter<*>

        val extras = intent.extras
        val stringVal = extras?.getString("KEY")

//        Before

//        val users = arrayOf(
//            "One", "Two", "Three",
//            "Four", "Five", "Six", "Seven", "Eight",
//            "Nine", "Ten"
//        )

//        After
        val users = arrayOf(
            "$stringVal 1 in the list",
            "$stringVal 2 the list",
            "$stringVal 3 the list",
            "$stringVal 4 the list",
            "$stringVal 5 the list",
            "$stringVal 6 the list",
            "$stringVal 7 the list",
            "$stringVal 8 the list",
            "$stringVal 9 the list",
            "$stringVal 10 the list",
        )

        val mListView = findViewById<android.widget.ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, users
        )
        mListView.adapter = arrayAdapter

        val dummyTextView = findViewById<TextView>(R.id.testName)
        dummyTextView.text = stringVal

    }
}
