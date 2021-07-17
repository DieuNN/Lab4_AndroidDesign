package com.example.lab4.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import com.example.lab4.R
import kotlinx.android.synthetic.main.activity_bai1.*

class Bai1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai1)

        // Using 'kotlin-android-extensions'
        val mToolBar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.myToolbarBai1)
        setSupportActionBar(mToolBar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mToolBar.setNavigationIcon(R.drawable.download_d)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        title = ""
        mToolBar.setLogo(R.drawable.outline_face_24)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option_first_option -> Toast.makeText(this, "First option", Toast.LENGTH_SHORT).show()
            R.id.option_second_option -> Toast.makeText(this, "Second option", Toast.LENGTH_SHORT).show()
            R.id.option_third_option -> Toast.makeText(this, "Third option", Toast.LENGTH_SHORT).show()
            R.id.option_fourth_option -> Toast.makeText(this, "Fourth option", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}