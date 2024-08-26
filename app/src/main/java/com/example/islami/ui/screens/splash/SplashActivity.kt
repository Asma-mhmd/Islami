package com.example.islami.ui.screens.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.islami.R
import com.example.islami.databinding.ActivitySplashBinding
import com.example.islami.ui.screens.home.HomeActivity
import com.example.islami.ui.screens.tasbeeh.TasbeehActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({ NavigateToHome(); },3000)
    }

    private fun NavigateToHome(){

        val intent = Intent(this, HomeActivity::class.java )
        startActivity(intent)


    }
}