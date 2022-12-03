package com.example.caltime
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import androidx.fragment.app.Fragment
import java.sql.Time
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = Calender()
        val secondFragment = Times()
        val fragment1: Button = findViewById(R.id.Calender)
        val fragment2: Button = findViewById(R.id.Time)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.Fragment, firstFragment)
            commit()
        }
        fragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Fragment, firstFragment)
                commit()
            }
        }
        fragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Fragment, secondFragment)
                commit()
            }
        }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
            val inflater = menuInflater
            inflater.inflate(R.menu.menu1, menu)
            return super.onCreateOptionsMenu(menu)    }

        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when(item.itemId){
        R.id.item1 -> Toast.makeText(this,"item 1 selected",Toast.LENGTH_SHORT).show()
        R.id.item1 -> Toast.makeText(this,"item 2 selected",Toast.LENGTH_SHORT).show()
        R.id.item1 -> Toast.makeText(this,"item 3 selected",Toast.LENGTH_SHORT).show()
    }
        return true
    }
}

