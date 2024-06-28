package com.example.toolbar

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.toolbar.databinding.ActivityListagemProfessorBinding

class ListagemProfessor : AppCompatActivity() {

    private val binding by lazy {
        ActivityListagemProfessorBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

    }



    //Criando o menu_principal da tela do App
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return true
    }



    //Ação de clique nos itens do menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //Testando a ação de clique
        when(item.itemId){
            R.id.menu_home -> {
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                val intent = Intent (this, Principal::class.java)
                startActivity(intent)
            }

            R.id.menu_aluno -> {
                Toast.makeText(this, "Alunos", Toast.LENGTH_SHORT).show()
                val intent = Intent (this, ListagemAluno::class.java)
                startActivity(intent)
            }

            R.id.menu_professor -> {
                Toast.makeText(this, "Professores", Toast.LENGTH_SHORT).show()
                val intent = Intent (this, ListagemProfessor::class.java)
                startActivity(intent)
            }

            R.id.menu_turma -> {
                Toast.makeText(this, "Turmas", Toast.LENGTH_SHORT).show()
                val intent = Intent (this, ListagemTurma::class.java)
                startActivity(intent)
            }

            R.id.menu_sair -> {
                Toast.makeText(this, "Sair", Toast.LENGTH_SHORT).show()
                val intent = Intent (this, MainActivity::class.java)
                startActivity(intent)
            }

            R.id.menu_adm -> {
                Toast.makeText(this, "Administrador", Toast.LENGTH_SHORT).show()
                val intent = Intent (this, ListagemADM::class.java)
                startActivity(intent)
            }

            R.id.menu_galeria -> {
                Toast.makeText(this, "Galeria", Toast.LENGTH_SHORT).show()
                val intent = Intent (this, AbrirGaleria::class.java)
                startActivity(intent)
            }

        }

        return true
    }
}