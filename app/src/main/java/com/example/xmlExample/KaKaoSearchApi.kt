package com.example.xmlExample

import retrofit2.http.GET
import retrofit2.http.POST

interface KaKaoSearchApi {
    @GET("v2/search/image")
    suspend fun getImage()
}