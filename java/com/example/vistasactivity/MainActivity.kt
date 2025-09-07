package com.example.vistasactivity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vistasactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       // binding.lbltitulo.text = "App para pasar parametros"

        val miTxtValor = binding.txtvalor
        val miBtnEnviable = binding.btnEnviar

        miBtnEnviable.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            intento1.putExtra("direccion", miTxtValor.toString())
            startActivity(intento1)
        }
    }
}

