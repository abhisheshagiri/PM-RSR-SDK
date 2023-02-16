package com.example.pm.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMsg {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, "$message: I am from RSR SDK", Toast.LENGTH_SHORT).show()
        }
    }
}