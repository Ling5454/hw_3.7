package com.example.cl_37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cl_37.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val musicName = intent.getStringExtra("musicName")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = musicName

    }
}