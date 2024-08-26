package com.example.islami.ui.screens.home.tabs.quran

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Intents
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islami.databinding.FragmentQuranBinding
import com.example.islami.ui.screens.home.constants


class QuranFragment : Fragment() {
lateinit var binding: FragmentQuranBinding
lateinit var chapterAdapter: chapterAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentQuranBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chptersRecyclerView()
    }

    private fun chptersRecyclerView() {
        chapterAdapter = chapterAdapter(constants.surahs){chapter,position->
        var intent = Intent(requireActivity(),SuraDetailsActivity::class.java)
            intent.putExtra("Sura name",chapter.chapter)
            intent.putExtra("file name","${position+1}.txt")
            startActivity(intent)
        }
        binding.quranRecyclerView.adapter=chapterAdapter
    }
}

