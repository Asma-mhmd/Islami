package com.example.islami.ui.screens.home.tabs.quran

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islami.databinding.ChapterItemBinding

class chapterAdapter (val chapters: List<chapterDM>, val OnClickItem : (chapterDM,Int)-> Unit)
    :Adapter<chapterAdapter.ChapterViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterViewHolder {
        val binding = ChapterItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ChapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
          return chapters.size    }

    override fun onBindViewHolder(holder: ChapterViewHolder, position: Int) {
        val chapter = chapters[position]
        holder.binding.chapterName.text=chapter.chapter
        holder.binding.chapterDeatails.text=chapter.verses.toString()
        holder.binding.root.setOnClickListener{
            OnClickItem(chapter,position)

        }
          }
    class ChapterViewHolder(val binding:ChapterItemBinding):ViewHolder(binding.root){


    }

}