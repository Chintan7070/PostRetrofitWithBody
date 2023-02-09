package com.example.postretrofit.models.hypnosismodels

import javax.annotation.Generated
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Generated("jsonschema2pojo")
class ZoneID {
    @SerializedName("zoneName")
    @Expose
    var zoneName: String? = null

    @SerializedName("ownerRecordName")
    @Expose
    var ownerRecordName: String? = null

    @SerializedName("zoneType")
    @Expose
    var zoneType: String? = null
}