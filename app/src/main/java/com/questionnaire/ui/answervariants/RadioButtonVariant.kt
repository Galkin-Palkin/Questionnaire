package com.questionnaire.ui.answervariants

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtonVariant(text: String) {
    Row(
        modifier = Modifier.background(Color.Red).padding(10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        RadioButton(selected = false, onClick = null)

        Text(text)
    }
}