package com.example.postretrofit.models.hypnosismodels

import javax.annotation.Generated
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Generated("jsonschema2pojo")
class Tag {
    @SerializedName("value")
    @Expose
    var value: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null
}