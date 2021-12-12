package com.example.aluraandroidkotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

//configurar tambem no manifest
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a)!!", Toast.LENGTH_SHORT).show()

        setContentView(R.layout.activity_main)

        //cada text view é uma view
        //para acessar uma vie, utilizamos o comando abaixo
        //chamaos de 'bind' om layout
        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de Frutas"

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e uva"

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.90"

    }
}