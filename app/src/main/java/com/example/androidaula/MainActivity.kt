package com.example.androidaula

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidaula.databinding.ActivityMainBinding
import org.w3c.dom.Text

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
        tvDisplay.text"olá mundo"
        val btn_4: Button=findViewById(R.id.btm_4)
        val btn_5: Button=findViewById(R.id.btm_5)
        val btn_6: Button=findViewById(R.id.btm_6)
        val btn_subtracao: Button=findViewById(R.id.menos)


    }
}