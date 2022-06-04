package com.talhafaki.nestednavgraph.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
fun HomeScreen(
    navigateToAuth: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally),
            text = "Home",
            style = MaterialTheme.typography.h3.copy(
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp
            )
        )

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .clickable {
                    navigateToAuth.invoke()
                },
            text = "Go to Auth",
            style = MaterialTheme.typography.h3.copy(
                color = Color.Red,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp
            )
        )
    }
}