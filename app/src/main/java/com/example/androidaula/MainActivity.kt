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

        var num1: Double = 0.0
        var num2: Double = 0.0
        var result: Double = 0.0
        var operacao: String = ""
        val tvDisplay: TextView = findViewById(R.id.tv_display)

        val btn1: Button = findViewById(R.id.btn_1)
        val btn2: Button = findViewById(R.id.btn_2)
        val btn3: Button = findViewById(R.id.btn_3)
        val btn_4: Button = findViewById(R.id.btm_4)
        val btn_5: Button = findViewById(R.id.btm_5)
        val btn_6: Button = findViewById(R.id.btm_6)
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
        val btnPonto: Button = findViewById(R.id.btn_ponto)

        btnPonto.setOnClickListener {
            if (tvDisplay.text.toString().isEmpty()) {
                tvDisplay.text = "0."
            } else {
                tvDisplay.text = tvDisplay.text.toString() + "."
            }
        }

        btn0.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "0"
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

        btn_4.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "4"
        }

        btn_5.setOnClickListener {
            tvDisplay.text = tvDisplay.text.toString() + "5"
        }

        btn_6.setOnClickListener {
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
            num1 = tvDisplay.text.toString().toDouble()
            operacao = "+"
            tvDisplay.text = ""
        }

        btn_subtracao.setOnClickListener {
            num1 = tvDisplay.text.toString().toDouble()
            operacao = "-"
            tvDisplay.text = ""
        }

        btnLimpar.setOnClickListener {
            tvDisplay.text = ""
        }

        btnvezes.setOnClickListener {
            num1 = tvDisplay.text.toString().toDouble()
            operacao = "*"
            tvDisplay.text = ""
        }

        btnDividir.setOnClickListener {
            num1 = tvDisplay.text.toString().toDouble()
            operacao = "/"
            tvDisplay.text = ""
        }

        btnIgual.setOnClickListener {
            num2 = tvDisplay.text.toString().toDouble()
            result = calculaResultado(operacao, num1, num2)
            tvDisplay.text = result.toString()
        }
    }
}

fun calculaResultado(operacao: String, num1: Double, num2: Double): Double {
    var result: Double = 0.0
    when (operacao) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> result = num1 / num2
    }
    return result
}