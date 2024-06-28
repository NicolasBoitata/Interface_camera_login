package com.example.toolbar

import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.toolbar.databinding.ActivityAbrirGaleriaBinding

class AbrirGaleria : AppCompatActivity() {

    //viewBinding
    private val binding by lazy {
        ActivityAbrirGaleriaBinding.inflate(layoutInflater)
    }

    //Permissões
    private var permissaoCamera = false
    private var permissaoGaleria = false

    private var bitmapImagemCamera: Bitmap? = null


    //Gestão da Galeria do Celular
    private val gestaoGaleria = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ){ uri ->
        if ( uri != null){
            binding.imgPerfil.setImageURI( uri )
            Toast.makeText(this,
                "Imagem Selecionada",
                Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,
                "Nenhuma Imagem Selecionada",
                Toast.LENGTH_SHORT).show()
        }
    }



    //Permissão da Câmera
    private val gerenciaCamera = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ){resultadoActivity ->
        bitmapImagemCamera = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            resultadoActivity.data?.extras?.getParcelable("data", Bitmap::class.java)
        }else{
            resultadoActivity.data?.extras?.getParcelable("data")
        }
        binding.imgPerfil.setImageBitmap( bitmapImagemCamera )
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        acessarGaleria()

        binding.btnAddCamera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            gerenciaCamera.launch( intent )
        }

    }

    private fun acessarGaleria() {
        binding.btnAddGaleria.setOnClickListener {
            gestaoGaleria.launch("image/*")
        }
    }


}



