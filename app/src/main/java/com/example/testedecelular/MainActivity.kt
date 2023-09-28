package com.example.testedecelular

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var preco : EditText
    private lateinit var btnCalcular : Button
    private lateinit var resposta : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()

    }
    fun setupView(){
        preco = findViewById<EditText>(R.id.editTextText)

        btnCalcular = findViewById<Button>(R.id.button)
        resposta = findViewById<TextView>(R.id.textView)

    }

    fun setupListeners(){

        btnCalcular.setOnClickListener {
            var textodigitado = preco.text.toString().toFloat()

            if(textodigitado.toInt() == 1625){
                //Log.d( "texto digitado", textodigitado.toString())
                resposta.text= "sai dai sua louca "
            }
            if(textodigitado.toInt() != 1625){
                //Log.d( "texto digitado", textodigitado.toString())
                resposta.text= "errou a senha "
            }

        }

    }
    
}


