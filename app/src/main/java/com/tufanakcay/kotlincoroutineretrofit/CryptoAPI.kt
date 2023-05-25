package com.tufanakcay.kotlincoroutineretrofit

import retrofit2.Response
import retrofit2.http.GET

interface CryptoAPI {

    @GET("tufanakcay/JSONDataSet/main/crypto.json")
    suspend fun getData(): Response<List<CryptoModel>>

}