package com.example.postretrofit.models.hypnosismodels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Created {
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