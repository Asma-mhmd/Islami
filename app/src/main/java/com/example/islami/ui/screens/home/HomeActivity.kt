package com.example.islami.ui.screens.home

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.islami.R
import com.example.islami.databinding.ActivityHomeBinding
import com.example.islami.ui.screens.home.tabs.ahadeth.AhadethFragment
import com.example.islami.ui.screens.home.tabs.quran.QuranFragment
import com.example.islami.ui.screens.home.tabs.radio.RadioFragment
import com.example.islami.ui.screens.home.tabs.sebha.SebhaFragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ShowFragment(QuranFragment())
        FragmentClick()

}
    private fun ShowFragment(fargment:Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fargment)
            .commit()

    }
private fun FragmentClick() {
    binding.bottomNavMenu.setOnItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.quran -> {
                ShowFragment(QuranFragment())
            }
            R.id.sebha ->{
                ShowFragment(SebhaFragment())
            }
            R.id.ahadeth ->{
            ShowFragment(AhadethFragment())
        }
            R.id.radio ->{
                ShowFragment(RadioFragment())
            }
        }
        return@setOnItemSelectedListener true


    }
}}