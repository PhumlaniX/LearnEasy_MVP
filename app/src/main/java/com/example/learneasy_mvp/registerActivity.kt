package com.example.learneasy_mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class registerActivity : AppCompatActivity() {

    //private val code: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val email = findViewById<EditText>(R.id.edtEmail)
        val pass1 = findViewById<EditText>(R.id.edtPassword)
        val pass2 = findViewById<EditText>(R.id.edtPassword2)
        val regBtn = findViewById<Button>(R.id.btnRegister)
        val signin = findViewById<TextView>(R.id.alreadyTxt)

        regBtn.setOnClickListener{
            //Toast.makeText(this, "Successfully registered", Toast.LENGTH_SHORT).show()
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}