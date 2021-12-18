package com.example.androidcomposeui.data.network

import com.example.androidcomposeui.data.model.PageResponse
import com.example.androidcomposeui.utils.ConstantUtils
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(ConstantUtils.PATH_URL)
    suspend fun getPage(): Response<PageResponse>
}