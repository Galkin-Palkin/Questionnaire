package com.questionnaire.ui.answervariants

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.Checkbox
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp

@Composable
fun CheckBoxVariant() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Checkbox(checked=false, onCheckedChange = null)

        Text("TODO")
    }
}