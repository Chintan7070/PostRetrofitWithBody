package com.example.postretrofit.apitools

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiClient {

    companion object {

        private lateinit var retrofit: Retrofit

        fun getretrogfit(): Retrofit {

            retrofit = Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
    }

}