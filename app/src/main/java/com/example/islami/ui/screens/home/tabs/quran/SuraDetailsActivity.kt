package com.example.islami.ui.screens.home.tabs.quran


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.islami.databinding.ActivitySuraDetailsBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class SuraDetailsActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySuraDetailsBinding
    var sura = ""
    var verseNumber=1

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySuraDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
       var SuraName =  intent.getStringExtra("Sura name")
       var fileName= intent.getStringExtra("file name")
       readFileFromAssets("quran/$fileName")
        binding.suraName.text = "${"  سورة"+" "+SuraName}"
        binding.sura.text = sura

    }
    private fun readFileFromAssets(fileName: String) {
        // Obtain AssetManager
        val assetManager = assets

        // Open the file using AssetManager
        val inputStream = assetManager.open(fileName)

        // Create a BufferedReader to read the file
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))

        // Read the file line by line
        var line: String? = bufferedReader.readLine()
        while (line != null) {
            // Process each line (for example, print it to Logcat)
            sura = sura+ line +"{$verseNumber}"
            println(line)
            line = bufferedReader.readLine()
            verseNumber++
        }

        // Close the reader
        bufferedReader.close()
    }
}