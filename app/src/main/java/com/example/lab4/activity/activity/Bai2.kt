package com.example.lab4.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lab4.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_bai2.*

class Bai2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai2)

        // plugin 'kotlin-android-extensions', don't need to use findViewById()

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_favorite -> Toast.makeText(this, "Favorite", Toast.LENGTH_SHORT).show()
                R.id.action_schedule -> Toast.makeText(this, "Schedule option", Toast.LENGTH_SHORT).show()
                R.id.action_volume_up -> Toast.makeText(this, "Volume up", Toast.LENGTH_SHORT).show()
            }
            true
        }

    }
}