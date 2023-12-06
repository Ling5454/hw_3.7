package com.example.cl_37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container_one, FragmentPic()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_two, FragmentList()).commit()
    }
}