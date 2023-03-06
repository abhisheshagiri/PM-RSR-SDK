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
        for (i in 1..5) {
            dummyList = arrayListOf("$stringVal $i in the list")
        }


        val mListView = findViewById<android.widget.ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, dummyList
        )
        mListView.adapter = arrayAdapter

        val dummyTextView = findViewById<TextView>(R.id.testName)
        dummyTextView.text = stringVal

    }
}
