package com.example.postretrofit.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PostModelClass {
    @SerializedName("page")
    @Expose
    var page: Int? = null

    @SerializedName("per_page")
    @Expose
    var perPage: Int? = null

    @SerializedName("total")
    @Expose
    var total: Int? = null

    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null

    @SerializedName("data")
    @Expose
    var data: List<Datum>? = null

    @SerializedName("support")
    @Expose
    var support: Support? = null
}