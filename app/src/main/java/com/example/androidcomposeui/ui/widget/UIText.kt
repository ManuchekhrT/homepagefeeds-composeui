package com.example.androidcomposeui.ui.widget

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcomposeui.data.model.UIAttributes
import com.example.androidcomposeui.ui.theme.black
import com.example.androidcomposeui.utils.HexToJetpackColor

/*
  We create this ui when card_type = text - from json response
 */
@Composable
fun UIText(text: String?, attributes: UIAttributes?) {
    Text(
        text = text ?: "",
        color = HexToJetpackColor.getColor(attributes?.textColor ?: black),
        fontSize = attributes?.font?.size?.sp ?: 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(16.dp)
    )
}