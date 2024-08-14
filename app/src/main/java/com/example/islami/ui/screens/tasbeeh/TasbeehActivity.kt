package com.example.islami.ui.screens.tasbeeh

import android.animation.ObjectAnimator
import android.graphics.BitmapFactory
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewTreeObserver
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.islami.R
import com.example.islami.databinding.ActivityTasbeehBinding
import org.w3c.dom.Text

class TasbeehActivity : AppCompatActivity() {
  lateinit var binding : ActivityTasbeehBinding
  lateinit var sebha: ImageView
  lateinit var numbers : TextView
  lateinit var zekr :TextView
    var counter = 0
    var zekrCounter=0
    var rotation = 1f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTasbeehBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sebha = binding.sebha
        numbers = binding.numbers
        zekr = binding.zekr

        sebha.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                sebha.pivotX = sebha.width / 2f
                sebha.pivotY = sebha.height / 2f
                sebha.viewTreeObserver.removeOnGlobalLayoutListener(this)
            }
        })
        sebha.setOnClickListener(){
            rotateImage()
//
            if(counter<33){
                counter++
            }else{counter=0
            zekrCounter++}
            if (zekrCounter==0){
                zekr.text="سبحان الله"
            }else if (zekrCounter==1){
                zekr.text="الحمد الله"
            }else if (zekrCounter==2){
                zekr.text="الله اكبر"

            }
            if (zekrCounter>2){
                zekrCounter=0
                zekr.text="سبحان الله"
            }
            SebhaClick()

    }
    }

    private fun rotateImage() {
        val animator = ObjectAnimator.ofFloat(sebha, "rotation", sebha.rotation, sebha.rotation + 360/33f)
        animator.duration = 300
        animator.start()
    }
     fun SebhaClick(){
        numbers.text="$counter"

     }}
