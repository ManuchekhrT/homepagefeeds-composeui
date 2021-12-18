package com.example.androidcomposeui.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.androidcomposeui.data.model.UIImage
import com.example.androidcomposeui.data.model.UIText
import com.example.androidcomposeui.ui.theme.black
import com.example.androidcomposeui.utils.HexToJetpackColor

/*
  Created this ui when card_type = image_title_description - from json response
 */
@ExperimentalCoilApi
@Composable
fun UIImageTitleDescription(title: UIText?, description: UIText?, image: UIImage?) {
    val width = image?.size?.width?.toFloat()
    val height =  image?.size?.height?.toFloat()
    val ratioSize = width?.div(height ?: 1f) ?: 1f
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(ratioSize)
            .padding(16.dp)
    ) {
        Image(
            painter = rememberImagePainter(image?.url),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomStart)
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
}