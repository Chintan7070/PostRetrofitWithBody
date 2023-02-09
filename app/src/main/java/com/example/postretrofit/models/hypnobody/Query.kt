package com.example.postretrofit.models.hypnobody

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Query {
    @SerializedName("recordType")
    @Expose
    var recordType: String? = null
}