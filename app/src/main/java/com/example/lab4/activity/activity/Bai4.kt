package com.example.lab4.activity.activity

import android.icu.number.Notation.simple
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.lab4.R
import kotlinx.android.synthetic.main.activity_bai4.*

class Bai4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai4)

        val stringList = mutableListOf<String>("1", "2", "3", "4", "5", "6", "7", "8", "10")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stringList)
        list_view.adapter = adapter

        registerForContextMenu(list_view)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.option_menu, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option_first_option -> Toast.makeText(this, "First Option", Toast.LENGTH_SHORT)
                .show()
            R.id.option_second_option -> Toast.makeText(this, "Second option", Toast.LENGTH_SHORT)
                .show()
            R.id.option_third_option -> Toast.makeText(this, "Third option", Toast.LENGTH_SHORT)
                .show()
            R.id.option_fourth_option -> Toast.makeText(this, "Fourth option", Toast.LENGTH_SHORT)
                .show()
        }
        return super.onContextItemSelected(item)
    }
}