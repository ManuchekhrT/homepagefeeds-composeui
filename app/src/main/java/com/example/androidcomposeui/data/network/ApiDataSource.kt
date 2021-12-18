package com.example.androidcomposeui.data.network

import javax.inject.Inject

class ApiDataSource @Inject constructor(private val apiService: ApiService) {
    suspend fun getPage() = apiService.getPage()
}