package com.example.toolbar

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.toolbar.databinding.ActivityMainBinding

class ListagemADM : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listagem_adm)

        binding.btnentrar.setOnClickListener {
            val intent = Intent (this, ListagemADM::class.java)
            startActivity(intent)
        }
    }
}