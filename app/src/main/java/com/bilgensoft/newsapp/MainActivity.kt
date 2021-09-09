package com.bilgensoft.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilgensoft.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val fragmentManager= super.getSupportFragmentManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()
    }
}