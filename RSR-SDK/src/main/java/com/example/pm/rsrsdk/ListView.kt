package com.example.pm.rsrsdk

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListView: AppCompatActivity() {
//    private val dummyList = intent.getStringArrayListExtra("listDummy")

    var extras = intent.extras
    private val dummyString = intent.getStringExtra("stringDummy")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        val arrayAdapter: ArrayAdapter<*>

//        Before

        val users = arrayOf(
            "One", "Two", "Three",
            "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten"
        )

//        After

//        val users = arrayOf(dummyList)

        val mListView = findViewById<android.widget.ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, users
        )
        mListView.adapter = arrayAdapter

        val dummyTextView = findViewById<TextView>(R.id.testName)
        dummyTextView.text = extras!!.getString("KEY")

    }
}
