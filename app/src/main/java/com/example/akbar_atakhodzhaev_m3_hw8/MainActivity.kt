package com.example.akbar_atakhodzhaev_m3_hw8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akbar_atakhodzhaev_m3_hw8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}