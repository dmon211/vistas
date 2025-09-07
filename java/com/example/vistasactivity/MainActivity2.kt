package com.example.vistasactivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vistasactivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding2: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding2.root
        setContentView(view)

        val bundle = intent.extras
        val dato = bundle?.getString("direccion")

        binding2.displayNombre.text = "Mi nombre es :$dato"
        binding2.btnBack.setOnClickListener {
                val intento2 = Intent(this, MainActivity::class.java)
                startActivity(intento2)
                finish()

        }
    }
}