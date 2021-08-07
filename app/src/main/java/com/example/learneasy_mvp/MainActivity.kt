package com.example.learneasy_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learneasy_mvp.core.model.Category

class MainActivity : AppCompatActivity() {
    val ApiInterface apiInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courseView = findViewById<RecyclerView>(R.id.course_recycler)
        courseView.layoutManager = LinearLayoutManager(this)

        val category = ArrayList<Category>()
    }
}