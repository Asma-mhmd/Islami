package com.example.islami.ui.screens.home.tabs.ahadeth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islami.databinding.FragmentAhadethBinding


class AhadethFragment : Fragment() {
lateinit var binding: FragmentAhadethBinding
lateinit var adapter :AhadethAdapter
var ahadethlist= ArrayList<AhadethDM>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAhadethBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        for (i: Int in 1..60){
            ahadethlist.add(AhadethDM(i))

        }
        adapter=AhadethAdapter(ahadethlist){position->
            var intent = Intent(requireActivity(),HadethDetailsActivity::class.java)
            intent.putExtra("Hadeth number","${position+1}")
            intent.putExtra("File Name","${position+1}.txt")
            startActivity(intent)
        }
        binding.ahadethRecyclerView.adapter=adapter
    }
}