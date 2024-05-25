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

        val tvDisplay: TextView = findViewById(R.id.tv_display)

        val btn1: Button = findViewById(R.id.btn_1)
        val btn2: Button = findViewById(R.id.btn_2)
        val btn3: Button = findViewById(R.id.btn_3)
        val btn4: Button = findViewById(R.id.btm_4)
        val btn5: Button = findViewById(R.id.btm_5)
        val btn6: Button = findViewById(R.id.btm_6)
        val btn7: Button = findViewById(R.id.btn_7)
        val btn8: Button = findViewById(R.id.btn_8)
        val btn9: Button = findViewById(R.id.btn_9)
        val btn0: Button = findViewById(R.id.btn_0)
        val btnMais: Button = findViewById(R.id.btn_mais)
        val btnLimpar: Button = findViewById(R.id.btn_limpar)
        val btnIgual: Button = findViewById(R.id.btn_igual)
        val btnDividir: Button = findViewById(R.id.btn_dividir)
        val btn_subtracao: Button = findViewById(R.id.menos)
        val btnvezes: Button = findViewById(R.id.btn_vezes)

        var n1: Double = 0.0
        var n2: Double = 0.0
        var result: Double = 0.0
        var operacao: String = "+"


        btn0.setOnClickListener {
            tvDisplay.text = "0"
        }

        btn1.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "1"
        }

        btn2.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "2"
        }

        btn3.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "3"
        }
        btn4.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "4"
        }
        btn5.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "5"
        }
        btn6.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "6"
        }
        btn7.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "7"
        }

        btn8.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "8"
        }
        btn9.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "9"
        }


        btnMais.setOnClickListener {
            operacao = "+"
            n1 = tvDisplay.text.toString().toDouble()
            tvDisplay.text = " "

        }
        btn_subtracao.setOnClickListener {
            operacao = "-"
            n1 = tvDisplay.text.toString().toDouble()
            tvDisplay.text = " "
        }

        btnLimpar.setOnClickListener {
            tvDisplay.text = " "
        }
        btnvezes.setOnClickListener {
            operacao = "*"
            n1 = tvDisplay.text.toString().toDouble()
            tvDisplay.text = " "
        }

        btnIgual.setOnClickListener {
            n2 = tvDisplay.text.toString().toDouble()
            result= calculaResultado(operacao,n1,n2)
            tvDisplay.text = result.toString()

        }

        btnDividir.setOnClickListener {
            operacao = "/"
            n2 = tvDisplay.text.toString().toDouble()
            tvDisplay.text = " "
        }


    }
}

fun calculaResultado(op: String, n1: Double, n2: Double): Double {
    var r: Double = 0.0
    when (op) {
        "+" -> r = n1 + n2
        "-" -> r = n1 - n2
        "/" -> r = n1 / n2
        "*" -> r = n1 * n2
    }
    return r
}