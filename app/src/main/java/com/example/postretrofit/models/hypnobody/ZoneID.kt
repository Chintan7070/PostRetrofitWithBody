package com.example.postretrofit.models.hypnobody

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ZoneID {
    @SerializedName("zoneName")
    @Expose
    var zoneName: String? = null
}