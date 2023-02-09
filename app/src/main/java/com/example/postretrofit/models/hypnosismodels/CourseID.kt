package com.example.postretrofit.models.hypnosismodels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class CourseID {
    @SerializedName("value")
    @Expose
    var value: Int? = null

    @SerializedName("type")
    @Expose
    var type: String? = null
}