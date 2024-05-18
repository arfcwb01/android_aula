package com.example.androidaula

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        // ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvDisplay: TextView = findViewById<TextView>(R.id.tv_display)
        tvDisplay.text = "Guilherme"

        val btn7: Button = findViewById(R.id.btn_7)
        val btn8 : Button = findViewById(R.id.btn_8)
        val btn9: Button = findViewById(R.id.btn_9)
        val btnMais: Button = findViewById(R.id.btn_mais)
        val btnLimpar: Button = findViewById(R.id.btn_limpar)
        val btn0: Button = findViewById(R.id.btn_0)
        val btnIgual: Button = findViewById(R.id.btn_igual)
        val btnDividir: Button = findViewById(R.id.btn_dividir)

        btn7.setOnClickListener { tvDisplay.text="7" }
        btn8.setOnClickListener { tvDisplay.text="8" }
        btn9.setOnClickListener { tvDisplay.text="9" }
        btnMais.setOnClickListener { tvDisplay.text="+" }
        btnLimpar.setOnClickListener { tvDisplay.text=" "}
        btn0.setOnClickListener { tvDisplay.text="0" }
        btnIgual.setOnClickListener { tvDisplay.text="="}
        btnDividir.setOnClickListener { tvDisplay.text="/"}




    }
}