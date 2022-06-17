package com.example.agregadorsocialpdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agregadorsocialpdm.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}