package com.example.network

import okhttp3.Interceptor
import okhttp3.Response

class FilmsInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("X-API-KEY", BuildConfig.apiKey)
            .build()

        return chain.proceed(request)
    }
}
