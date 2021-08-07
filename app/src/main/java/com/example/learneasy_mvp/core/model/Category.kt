package com.example.learneasy_mvp.core.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Category {
    @SerializedName("categoryId")
    @Expose
    var categoryId: String? = null
        set(categoryId) {
            image = categoryId
        }

    @SerializedName("categoryName")
    @Expose
    var categoryName: String? = null
        set(categoryName) {
            image = categoryName
        }

    @SerializedName("totalCourses")
    @Expose
    var totalCourses: String? = null
        set(totalCourses) {
            image = totalCourses
        }

    @SerializedName("image")
    @Expose
    var image: String? = null
}