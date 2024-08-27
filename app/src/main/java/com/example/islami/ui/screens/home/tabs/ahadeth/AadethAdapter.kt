package com.example.islami.ui.screens.home.tabs.ahadeth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islami.databinding.HadethItemBinding

class AhadethAdapter (val Ahadeth : List<AhadethDM>,val OnClick:(Int)->Unit):Adapter<AhadethAdapter.AhadethViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AhadethViewHolder {
        val binding = HadethItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AhadethViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Ahadeth.size
    }

    override fun onBindViewHolder(holder: AhadethViewHolder, position: Int) {
    holder.binding.hadethTV.text=" الحديث رقم ${position+1}"
    holder.binding.root.setOnClickListener{
        OnClick(position)
    }
    }
    class AhadethViewHolder(val binding:HadethItemBinding):ViewHolder(binding.root)

}