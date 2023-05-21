package com.example.listview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var usersToBeAdded: ArrayList<userdetails>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // real time hardcoded data as of now

        val name = arrayOf("Pulkit", "Prateek", "Rahul", "Rishabh", "Pushkar")
        val describe= arrayOf("Programmer","Mathematician","developer","Marketing","Flutter")
        val time= arrayOf("3:59 PM", "4:00 PM", "5:23 AM", "5:57 AM", "12:12 PM")
        val phone= arrayOf("56738","56134","45189","55612","90865")
        val images= arrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5)

        // data combining
        usersToBeAdded= ArrayList<userdetails>()

        for(index in name.indices){
            val user=userdetails(name[index],describe[index],time[index],images[index],phone[index])

            usersToBeAdded.add(user)
        }

        val listView= findViewById<ListView>(R.id.ListView)
        listView.isClickable = true
        listView.adapter=myOwnAdapter(this, usersToBeAdded)


        // adapter code



    }
}