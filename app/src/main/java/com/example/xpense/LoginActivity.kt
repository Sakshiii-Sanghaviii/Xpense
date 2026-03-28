package com.example.xpense   // keep your package name same

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val signupBtn = findViewById<Button>(R.id.signupBtn)

        loginBtn.setOnClickListener {

            val userEmail = email.text.toString()
            val userPass = password.text.toString()

            auth.signInWithEmailAndPassword(userEmail, userPass)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                        startActivity(Intent(this, DashboardActivity::class.java))
                    } else {
                        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        signupBtn.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}