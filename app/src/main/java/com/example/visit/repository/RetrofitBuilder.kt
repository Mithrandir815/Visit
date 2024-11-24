package com.example.visit.repository

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitBuilder {
    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://www.wantedly.com/")
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }
}