package com.example.listviewadapter_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.listviewadapter_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()
        val taskList = arrayListOf<String>()
        taskList.add("Make presentation")
        taskList.add("Have lunch")
        taskList.add("Make Notes")
        taskList.add("Attend lectures")
        taskList.add("Work on project")
        taskList.add("Study")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,taskList)

        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val text = "Clicked on "+(view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}