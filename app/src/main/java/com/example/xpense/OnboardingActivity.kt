package com.example.xpense

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val button = findViewById<Button>(R.id.getStartedBtn)

        button.setOnClickListener {
            // Navigate to next screen (Login)
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}