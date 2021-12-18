package com.example.androidcomposeui.ui.widget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcomposeui.data.model.UIText
import com.example.androidcomposeui.ui.theme.black
import com.example.androidcomposeui.utils.HexToJetpackColor

/*
  Created this ui when card_type = title_description - from json response
 */
@Composable
fun UITitleDescription(title: UIText?, description: UIText?) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = title?.value ?: "",
            color = HexToJetpackColor
                .getColor(title?.attributes?.textColor ?: black),
            fontSize = title?.attributes?.font?.size?.sp ?: 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description?.value ?: "",
            color = HexToJetpackColor
                .getColor(description?.attributes?.textColor ?: black),
            fontSize = description?.attributes?.font?.size?.sp ?: 18.sp
        )
    }
}
