package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var itemlist : ArrayList<Datamodel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        val view = binding.root
        setContentView(view)

        itemlist.add(Datamodel("Ayan",8250697452))
        itemlist.add(Datamodel("Ayanava",825067852))
        itemlist.add(Datamodel("Ayana",8250697452))
        itemlist.add(Datamodel("Anik",8250697452))
        itemlist.add(Datamodel("Sayan",82509637452))
        val customadApter= CustomAdapter(this,itemlist)
        binding.listView.adapter = customadApter





    }
}