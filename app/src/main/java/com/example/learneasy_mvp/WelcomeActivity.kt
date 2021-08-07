package com.example.learneasy_mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val logBtn = findViewById<Button>(R.id.btnLog)
        val regBtn = findViewById<Button>(R.id.btnReg)

        logBtn.setOnClickListener {
            //Toast.makeText(this, "Try logg", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
        regBtn.setOnClickListener {
            //Toast.makeText(this, "Successfully logged in", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }
    }
}