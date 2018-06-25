package com.vidroid.com.br.apps.event

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.vidroid.com.br.apps.event.fragments.info.InfoFragment
import com.vidroid.com.br.apps.event.fragments.map.MapFragment
import com.vidroid.com.br.apps.event.fragments.schedule.ScheduleFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toolbar.*

class MainActivity : AppCompatActivity() {

    //var btnButton = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.content, ScheduleFragment())
                .commit()

        bottom_navigation.selectedItemId = R.id.bottomMenuSchedule

        bottom_navigation.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.bottomMenuInfo -> {
                    val infoFragment = InfoFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.content, infoFragment).commit()

                    true
                }
                R.id.bottomMenuMap -> {
                    val mapFragment = MapFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.content, mapFragment).commit()

                    true
                }
                R.id.bottomMenuSchedule -> {
                    val scheduleFragment = ScheduleFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.content, scheduleFragment).commit()

                    true
                }
            }
            true
        }
    }
}
