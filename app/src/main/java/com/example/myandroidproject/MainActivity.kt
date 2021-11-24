package com.example.myandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*supportFragmentManager.beginTransaction().replace(R.id.frame, sub1()).commit()*/


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        var drawer = findViewById<DrawerLayout>(R.id.drawer)

        toggle = ActionBarDrawerToggle(this,drawer,R.string.open,R.string.close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        var units= arrayOf("ANDROID","SE","ASP.NET","DAA","AWS")
        var adapter = ArrayAdapter(this,R.layout.mylayout,R.id.textview1,units)
        var lv = findViewById<ListView>(R.id.listview1)
        lv.adapter = adapter

        lv.setOnItemClickListener { parent, view, position, id ->
            drawer.closeDrawers()
            when(position){
                    0 -> {
                        supportFragmentManager.beginTransaction().replace(R.id.frame, sub1()).commit()
                    }
                    1 -> {
                        supportFragmentManager.beginTransaction().replace(R.id.frame, sub2()).commit()
                    }
                    2 -> {
                         supportFragmentManager.beginTransaction().replace(R.id.frame, sub3()).commit()
                    }
                    3 -> {
                        supportFragmentManager.beginTransaction().replace(R.id.frame, sub4()).commit()
                    }
                    4 -> {
                        supportFragmentManager.beginTransaction().replace(R.id.frame, sub5()).commit()
                    }
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item))

            return true

        return super.onOptionsItemSelected(item)
    }
}