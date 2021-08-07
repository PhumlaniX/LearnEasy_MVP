package com.example.learneasy_mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learneasy_mvp.core.model.Category
import com.example.learneasy_mvp.retrofit.ApiInterface
import com.example.learneasy_mvp.core.extensions.showErrorMessage
import com.example.learneasy_mvp.core.extensions.toast
import com.example.learneasy_mvp.core.model.User
import com.example.learneasy_mvp.core.model.adapter.UserAdapter
import com.example.learneasy_mvp.core.model.extensions.showErrorMessage
import com.example.learneasy_mvp.core.model.extensions.toast
import com.example.learneasy_mvp.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    /*companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var adapter: UserAdapter
    private lateinit var recyclerView: RecyclerView
    private var courses: List<Category> = mutableListOf()

    private val itsGoTimeAPIService: APIService by lazy {
        RetrofitClient.apiService
    }*/
    ApiInterface apiInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val courseView = findViewById<RecyclerView>(R.id.course_recycler)
        courseView.layoutManager = LinearLayoutManager(this)

        fetchCourses()*/

    }
    /*private fun fetchCourses() {
        itsGoTimeAPIService.getAllCourses().enqueue(object : Callback<List<Category>> {

            override fun onResponse(call: Call<List<Category>>?, response: Response<List<Category>>) {
                if (response.isSuccessful) {
                    Log.i(TAG, "facilitators loaded from API $response")

                    response.body()?.let {
                        courses = it
                    }

                    if (courses.isNotEmpty())
                        setupRecyclerView(courses)
                    else
                        toast("No Items Found")

                } else {
                    Log.i(TAG, "error $response")
                    showErrorMessage(response.errorBody()!!)
                }
            }

            override fun onFailure(call: Call<List<User>>?, t: Throwable) {
                toast(t.message ?: "Error Fetching Results")
            }

        })
    }
    private fun setupRecyclerView(users: List<Category>) {
        adapter = UserAdapter(users)
        recyclerView.adapter = adapter

        // add on click for elements
        adapter.onItemClick = { user ->

            val intent = Intent(this, CourseDetailsActivity::class.java)
            intent.putExtra("Course", user)
            startActivity(intent)
        }
    }*/
}