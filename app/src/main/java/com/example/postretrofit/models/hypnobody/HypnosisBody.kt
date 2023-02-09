package com.example.postretrofit.models.hypnobody

import com.google.gson.annotations.SerializedName

class HypnosisBody {
    @SerializedName("zoneID")
    var zoneID: ZoneID? = null

    @SerializedName("query")
    var query: Query? = null
}