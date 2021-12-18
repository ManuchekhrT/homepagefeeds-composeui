package com.example.androidcomposeui.data.repository

import com.example.androidcomposeui.data.model.PageResponse
import com.example.androidcomposeui.data.network.ApiDataSource
import com.example.androidcomposeui.data.network.BaseApiResponse
import com.example.androidcomposeui.data.network.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val apiDataSource: ApiDataSource
) : MainRepository, BaseApiResponse() {

    override suspend fun getPage(): Flow<NetworkResponse<PageResponse>> {
        return flow {
            emit(
                safeApiCall {
                    apiDataSource.getPage()
                }
            )
        }.flowOn(Dispatchers.IO)
    }

}