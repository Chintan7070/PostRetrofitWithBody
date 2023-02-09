package com.example.postretrofit.models.hypnosismodels

import javax.annotation.Generated
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Generated("jsonschema2pojo")
class Record {
    @SerializedName("recordName")
    @Expose
    var recordName: String? = null

    @SerializedName("recordType")
    @Expose
    var recordType: String? = null

    @SerializedName("fields")
    @Expose
    var fields: Fields? = null

    @SerializedName("pluginFields")
    @Expose
    var pluginFields: PluginFields? = null

    @SerializedName("recordChangeTag")
    @Expose
    var recordChangeTag: String? = null

    @SerializedName("created")
    @Expose
    var created: Created? = null

    @SerializedName("modified")
    @Expose
    var modified: Modified? = null

    @SerializedName("deleted")
    @Expose
    var deleted: Boolean? = null

    @SerializedName("zoneID")
    @Expose
    var zoneID: ZoneID? = null
}