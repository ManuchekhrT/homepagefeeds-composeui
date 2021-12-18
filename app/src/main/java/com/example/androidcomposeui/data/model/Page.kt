package com.example.androidcomposeui.data.model

import com.google.gson.annotations.SerializedName

data class PageResponse(
    @SerializedName("page")
    val page: UIPage
) {
    data class UIPage(
        @SerializedName("cards")
        var cards: List<UICard>
    )
}
