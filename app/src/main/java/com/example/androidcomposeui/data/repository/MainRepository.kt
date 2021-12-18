package com.example.androidcomposeui.data.repository

import com.example.androidcomposeui.data.model.PageResponse
import com.example.androidcomposeui.data.network.NetworkResponse
import kotlinx.coroutines.flow.Flow

interface MainRepository {
    suspend fun getPage(): Flow<NetworkResponse<PageResponse>>
}