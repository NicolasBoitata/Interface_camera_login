package com.example.toolbar

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.toolbar.databinding.ActivityPrincipalBinding

class Principal : AppCompatActivity() {
    private val binding by lazy {
        ActivityPrincipalBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnaluno.setOnClickListener {
            val intent = Intent (this, ListagemAluno::class.java)
            startActivity(intent)
        }

        binding.btnprofessor.setOnClickListener{
            val intent = Intent (this, ListagemProfessor::class.java)
            startActivity(intent)
        }

        binding.btnadm.setOnClickListener{
            val intent = Intent (this, ListagemADM::class.java)
            startActivity(intent)
        }

        binding.btngaleria.setOnClickListener{
            val intent = Intent (this, AbrirGaleria::class.java)
            startActivity(intent)
        }

    }
}