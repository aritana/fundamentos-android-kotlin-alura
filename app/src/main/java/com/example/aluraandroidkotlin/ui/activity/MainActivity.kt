package com.example.aluraandroidkotlin.ui.activity


import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.aluraandroidkotlin.R
import com.example.aluraandroidkotlin.model.Produto
import com.example.aluraandroidkotlin.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

//configurar tambem no manifest
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a)!!", Toast.LENGTH_SHORT).show()

        //cada text view é uma view
        //para acessar uma vie, utilizamos o comando abaixo
        //chamaos de 'bind' om layout

        //encontrar recycler view
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "teste desc",
                    valor = BigDecimal("19.69")
                ),
                Produto(
                    nome = "teste 1",
                    descricao = "teste desc 1",
                    valor = BigDecimal("19.70")
                ),
                Produto(
                    nome = "teste 2",
                    descricao = "teste desc 2",
                    valor = BigDecimal("19.80")
                )
            )
        )

    }
}