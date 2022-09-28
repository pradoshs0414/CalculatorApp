package com.sharma.pradosh.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class DisplayScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_screen)
        Handler().postDelayed(Runnable {
                        startActivity(Intent(this,MainActivity::class.java))
        },4000)
    }
}