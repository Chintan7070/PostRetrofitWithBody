package com.example.postretrofit.models.hypnosismodels

import javax.annotation.Generated
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Generated("jsonschema2pojo")
class Modified {
    @SerializedName("timestamp")
    @Expose
    var timestamp: Long? = null

    @SerializedName("userRecordName")
    @Expose
    var userRecordName: String? = null

    @SerializedName("deviceID")
    @Expose
    var deviceID: String? = null
}