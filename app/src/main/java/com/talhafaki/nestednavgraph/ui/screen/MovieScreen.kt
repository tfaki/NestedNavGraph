package com.talhafaki.nestednavgraph.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Created by talhafaki on 4.06.2022.
 */
@Composable
fun MovieScreen() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally),
        text = "Movie Screen",
        style = MaterialTheme.typography.h3.copy(
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        )
    )
}