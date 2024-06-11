package com.example.kotlinapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splash : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        val h=findViewById<ProgressBar>(R.id.progressBar)
        Handler().postDelayed({
                              val k=Intent(this,MainActivity::class.java)

            startActivity(k)

        },3000)
        h.visibility=View.VISIBLE
        }

}