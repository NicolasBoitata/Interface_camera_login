package com.example.toolbar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


        private val binding by lazy {
            ActivityMainBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.btnentrar.setOnClickListener {
                val intent = Intent (this, Principal::class.java)
                startActivity(intent)
            }

        }
    }