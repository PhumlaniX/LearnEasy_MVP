package com.example.learneasy_mvp.retrofit;

import com.example.learneasy_mvp.core.model.Category;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;

public interface ApiInterface {

    @GET("courses.json")
    Call<List<Category>> getAllCategory();
}
