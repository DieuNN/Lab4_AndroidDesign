
package com.example.lab4.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import com.example.lab4.R
import kotlinx.android.synthetic.main.activity_bai5.*

class Bai5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai5)

        button_show_popup_menu.setOnClickListener { view ->
            val popupMenu = PopupMenu(this, view)
            menuInflater.inflate(R.menu.option_menu, popupMenu.menu)

            popupMenu.setOnMenuItemClickListener { item ->
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
                false
            }
            popupMenu.show()
        }

    }
}