package com.example.aluraandroidkotlin.ui.activity


import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.aluraandroidkotlin.R
import com.example.aluraandroidkotlin.ui.recyclerview.adapter.ListaProdutosAdapter

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

        //encontrar recycler view
        var recyclerView =  findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()


    }
}