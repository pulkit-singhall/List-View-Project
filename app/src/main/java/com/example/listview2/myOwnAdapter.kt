package com.example.listview2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myOwnAdapter(val context: Activity, val usersToBeAdded: ArrayList<userdetails>) :
    ArrayAdapter<userdetails> (context, R.layout.eachitemlayout, usersToBeAdded) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater= LayoutInflater.from(context)

        val view= inflater.inflate(R.layout.eachitemlayout, null)

        val image=view.findViewById<ImageView>(R.id.image)
        val name=view.findViewById<TextView>(R.id.person)
        val describe=view.findViewById<TextView>(R.id.description)
        val time=view.findViewById<TextView>(R.id.time)

        name.text= usersToBeAdded[position].name
        describe.text= usersToBeAdded[position].description
        time.text=usersToBeAdded[position].lastMsgTime
        image.setImageResource(usersToBeAdded[position].image)

        return view
    }
}