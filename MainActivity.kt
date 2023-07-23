package com.example.listvieworiginal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Itachi", "Eren", "Hinata",
            "Sebastian", "Mikasa"
        )

        val mListView =
            findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
        mListView.adapter = arrayAdapter
    }
}