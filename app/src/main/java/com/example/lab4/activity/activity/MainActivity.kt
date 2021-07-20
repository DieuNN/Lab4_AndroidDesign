package com.example.lab4.activity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab4.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_activity_bai1.setOnClickListener {
            startActivity(Intent(this, Bai1::class.java))
        }

        btn_activity_bai2.setOnClickListener {
            startActivity(Intent(this, Bai2::class.java))
        }

        btn_activity_bai3.setOnClickListener {
            startActivity(Intent(this, Bai3::class.java))
        }

        btn_activity_bai4.setOnClickListener {
            startActivity(Intent(this, Bai4::class.java))
        }

        btn_activity_bai5.setOnClickListener {
            startActivity(Intent(this, Bai5::class.java))
        }


    }
}