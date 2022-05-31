package com.example.semana_18

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.semana_18.databinding.ItemBinding


class vista (
    private val context:Context,
    private val textolista:MutableList<String>,
    private val colores:MutableList<String>,

        ):RecyclerView.Adapter<vista.ViewPagerHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding= ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val texto=textolista[position]
        val col=colores[position]

        holder.bind(texto,col)
    }

    override fun getItemCount(): Int {
        return textolista.size

    }

    class ViewPagerHolder(private var itemHolderBinding: ItemBinding):
            RecyclerView.ViewHolder(itemHolderBinding.root){

                fun bind(texto:String,col:String){
                    itemHolderBinding.texto.text=texto
                    itemHolderBinding.root.setBackgroundColor(Color.parseColor(col))
                }

            }
}
