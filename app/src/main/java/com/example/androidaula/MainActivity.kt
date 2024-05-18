package com.example.androidaula

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidaula.databinding.ActivityMainBinding

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

        val tvDisplay:TextView=findViewById(R.id.tv_display)
        val btn_4: Button=findViewById(R.id.btm_4)
        val btn_5: Button=findViewById(R.id.btm_5)
        val btn_6: Button=findViewById(R.id.btm_6)
        val btn_subtracao: Button=findViewById(R.id.menos)


        val btn1: Button = findViewById(R.id.btn_1)
        val btn2: Button = findViewById(R.id.btn_2)
        val btn3: Button = findViewById(R.id.btn_3)
        val btnvezes: Button = findViewById(R.id.btn_vezes)
        btn1.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "1"
        }

        btn2.setOnClickListener {
            tvDisplay.text = "2"
        }

        btn3.setOnClickListener {
            tvDisplay.text = "3"
        }

        btnvezes.setOnClickListener {
            tvDisplay.text = "*"
        }
    }
}