package com.example.postretrofit.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Support {
    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("text")
    @Expose
    var text: String? = null
}