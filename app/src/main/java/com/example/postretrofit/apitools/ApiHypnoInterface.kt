package com.example.postretrofit.apitools

import com.example.postretrofit.models.hypnobody.HypnosisBody
import com.example.postretrofit.models.hypnosismodels.HypnosisModelClass
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiHypnoInterface {

    @POST("1/iCloud.Hypnosis.meditation.iego/development/public/records/query?")
    fun getHypnoData(@Query("ckAPIToken") key: String, @Body request: HypnosisBody): Call<HypnosisModelClass>

}