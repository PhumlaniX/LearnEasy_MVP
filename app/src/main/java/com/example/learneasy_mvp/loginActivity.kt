package com.example.learneasy_mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.edtEmail)
        val password = findViewById<EditText>(R.id.edtPassword)
        val forgotten = findViewById<TextView>(R.id.forgottenPass)
        val loginBtn = findViewById<Button>(R.id.btnLogin)
        val newAcc = findViewById<TextView>(R.id.noAccTxt)

        loginBtn.setOnClickListener {
            Toast.makeText(this, "Successfully logged in", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validateInput(){

    }
}