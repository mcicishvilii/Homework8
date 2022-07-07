package com.example.homework8

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.util.Log.d
import androidx.core.content.ContextCompat
import com.example.homework8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setColor()
        binding.btnNext.setOnClickListener{

            nextActivity()
        }
    }



    private fun setColor(){
        val word = binding.tvMainText.text.toString()

        val greenColorForLastWord = ForegroundColorSpan(
            ContextCompat.getColor(this, R.color.holo_green_dark)
        )
        val spanable = SpannableStringBuilder(word)

        spanable.setSpan(
            greenColorForLastWord,
            spanable.length - 11,
            spanable.length - 4,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.tvMainText.text = spanable
    }

    private fun nextActivity(){
        val intent = Intent(this, Activity2::class.java).apply {
        }
        startActivity(intent)
    }
}