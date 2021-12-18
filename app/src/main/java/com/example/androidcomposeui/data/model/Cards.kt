package com.example.androidcomposeui.data.model

import com.google.gson.annotations.SerializedName

data class UICard(
    @SerializedName("card_type")
    val cardType: String,
    @SerializedName("card")
    val card: UIImageTitleDescription
)

// card_type = image_title_description
data class UIImageTitleDescription(
    @SerializedName("value")
    val value: String? = null,
    @SerializedName("attributes")
    val attributes: UIAttributes? = null,

    @SerializedName("image")
    val image: UIImage? = null,

    @SerializedName("title")
    val title: UIText? = null,
    @SerializedName("description")
    val description: UIText? = null,
)

data class UIAttributes(
    @SerializedName("text_color")
    val textColor: String,
    @SerializedName("font")
    val font: UIFont,
) {
    data class UIFont(
        @SerializedName("size")
        val size: Int,
    )
}

data class UIImage(
    @SerializedName("url")
    val url: String,
    @SerializedName("size")
    val size: UISize,
) {
    data class UISize(
        @SerializedName("width")
        val width: Int,
        @SerializedName("height")
        val height: Int
    )
}

// card_type = text
data class UIText(
    @SerializedName("value")
    val value: String,
    @SerializedName("attributes")
    val attributes: UIAttributes,
)

enum class CardType {
    text,
    title_description,
    image_title_description
}