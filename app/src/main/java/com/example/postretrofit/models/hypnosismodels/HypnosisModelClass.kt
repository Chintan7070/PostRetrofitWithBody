package com.example.postretrofit.models.hypnosismodels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class HypnosisModelClass {
    @SerializedName("records")
    @Expose
    var records: List<Record>? = null
}