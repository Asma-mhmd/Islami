package com.example.islami.ui.screens.home.tabs.radio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islami.databinding.FragmentRadioBinding


class RadioFragment : Fragment() {
lateinit var binding: FragmentRadioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRadioBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }}