package com.example.islami.ui.screens.home.tabs.sebha

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.islami.databinding.FragmentSebhaBinding


class SebhaFragment : Fragment() {
lateinit var binding : FragmentSebhaBinding
    lateinit var sebha: ImageView
    lateinit var numbers : TextView
    lateinit var zekr : TextView
    var counter = 0
    var zekrCounter=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSebhaBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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

