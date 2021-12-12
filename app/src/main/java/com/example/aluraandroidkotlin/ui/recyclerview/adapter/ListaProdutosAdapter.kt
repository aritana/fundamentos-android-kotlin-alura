package com.example.aluraandroidkotlin.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aluraandroidkotlin.R
import com.example.aluraandroidkotlin.model.Produtos

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produtos>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produtos) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text =produto.nome
            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text =produto.descricao
            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text =produto.valor.toPlainString()
        }
    }

    //responsavel pegar a view e fazer o  bind
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflar view
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item,parent,false)//layout que quero mostrar
        return ViewHolder(view)

    }

    //responsavel indica o item e posicao e view holder
    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }


    //quantos itens representar dentro dele
    override fun getItemCount(): Int = produtos.size

}
