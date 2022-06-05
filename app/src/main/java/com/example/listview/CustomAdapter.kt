package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

open class CustomAdapter(private val context: Context,private val arList: ArrayList<Datamodel>) : BaseAdapter() {
    lateinit var txt_name : TextView
    lateinit var txt_phone : TextView
    override fun getCount(): Int {
        return arList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView =p1
        convertView= LayoutInflater.from(context).inflate(R.layout.listview,p2,false)
        txt_name = convertView.findViewById(R.id.txt1)
        txt_phone = convertView.findViewById(R.id.txt2)
        txt_name.text = arList[p0].name.toString()
        txt_phone.text = arList[p0].phone.toString()
        return convertView

    }
}