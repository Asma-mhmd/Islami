package com.example.islami.ui.screens.home.tabs.ahadeth

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.islami.R
import com.example.islami.databinding.ActivityHadethDetailsBinding
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader


class HadethDetailsActivity : AppCompatActivity() {
    lateinit var binding:ActivityHadethDetailsBinding
    var hadeth =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHadethDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var hadethName = intent.getStringExtra("Hadeth number")
        var fileName = intent.getStringExtra("File Name")
        readFileFromAssets("hadeth/$fileName")
        binding.hadeth.text=hadeth
        binding.hadethName.text="الحديث رقم "+hadethName


    }
    private fun readFileFromAssets(fileName: String) {
        val  assetManaer = assets
        val inputStraem = assetManaer.open(fileName)
        val bufferedReader = BufferedReader(InputStreamReader(inputStraem))
        var line = bufferedReader.readLine()
        while (line != null){
            hadeth += line+" "
            line=bufferedReader.readLine()}
        bufferedReader.close()
        }

    }
