package com.example.androidcomposeui.ui.widget

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import coil.annotation.ExperimentalCoilApi
import com.example.androidcomposeui.data.model.CardType
import com.example.androidcomposeui.data.model.UICard

@ExperimentalCoilApi
@Composable
fun UICards(cards: List<UICard>) {
    LazyColumn {
        itemsIndexed(items = cards) { _, item ->
            when (item.cardType) {
                CardType.text.name -> {
                    UIText(
                        item.card.value,
                        item.card.attributes
                    )
                }
                CardType.title_description.name -> {
                    UITitleDescription(
                        title = item.card.title,
                        description = item.card.description
                    )
                }
                CardType.image_title_description.name -> {
                    UIImageTitleDescription(
                        title = item.card.title,
                        description = item.card.description,
                        image = item.card.image
                    )
                }
                else -> { }
            }
        }
    }
}
