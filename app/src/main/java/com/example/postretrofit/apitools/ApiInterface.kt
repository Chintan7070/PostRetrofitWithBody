package com.example.postretrofit.apitools

import com.example.postretrofit.models.PostModelClass
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiInterface {

    @GET("/api/users")
    fun getPOSTdata() : Call<PostModelClass>

   /* @FormUrlEncoded
    @POST("/api/users")
        fun getPOSTdata1(@Field("name") name : String,@Field("job")job : String) : Call<PostModelClass>*/

}