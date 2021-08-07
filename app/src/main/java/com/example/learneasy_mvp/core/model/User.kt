package com.example.learneasy_mvp.core.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User : Parcelable (
    var name: String,
    val roleName: String,
    val profileUrl: String
    ): Parcelable