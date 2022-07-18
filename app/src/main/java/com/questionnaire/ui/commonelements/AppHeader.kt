package com.questionnaire.ui.commonelements

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppHeader(text: String) {
    TopAppBar(
        backgroundColor = Color.Blue,
        contentColor = Color.White,
        elevation = 10.dp
    ) {
        Text(
            text,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(40.dp, 10.dp),
            color = Color.White
        )
    }
}