package com.example.islami.ui.screens.home.tabs.ahadeth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islami.databinding.FragmentAhadethBinding


class AhadethFragment : Fragment() {
lateinit var binding: FragmentAhadethBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAhadethBinding.inflate(inflater, container,false)
        return binding.root
    }}