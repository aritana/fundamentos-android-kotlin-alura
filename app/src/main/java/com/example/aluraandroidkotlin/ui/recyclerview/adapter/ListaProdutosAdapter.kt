package com.example.aluraandroidkotlin.ui.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aluraandroidkotlin.model.Produtos

class ListaProdutosAdapter (
    private val produtos : List<Produtos>
        ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //responsavel pegar a view e fazer o  bind
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    //responsavel indica o item e posicao e view holder
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    //quantos itens representar dentro dele
    override fun getItemCount(): Int = produtos.size

}
