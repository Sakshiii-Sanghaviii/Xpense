package com.example.xpense

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
// Make sure this matches your package name exactly
import com.example.xpense.databinding.ActivityCalendarBinding

class CalendarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalendarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This line initializes the binding
        binding = ActivityCalendarBinding.inflate(layoutInflater)

        // This line tells the Activity to use the binding layout
        setContentView(binding.root)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        // Logic for your bottom navigation goes here
    }
}