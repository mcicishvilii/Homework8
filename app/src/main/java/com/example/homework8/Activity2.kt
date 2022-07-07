package com.example.homework8

import android.R
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import com.example.homework8.databinding.Activity2Binding


class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val word = binding.tvDonthaveaccount.text.toString()

        val greenColorForLastWord = ForegroundColorSpan(
            ContextCompat.getColor(this, R.color.holo_green_dark)
        )
        val spanable = SpannableStringBuilder(word)

        spanable.setSpan(
            greenColorForLastWord,
            spanable.length - 7,
            spanable.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.tvDonthaveaccount.text = spanable

    }
}