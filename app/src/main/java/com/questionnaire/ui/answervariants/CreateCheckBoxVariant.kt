package com.questionnaire.ui.answervariants

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CreateCheckBoxVariant() {
    var text = remember {
        mutableStateOf("My text from VM here")
    }

    Card(
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Row(
            modifier = Modifier.padding(10.dp).fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Checkbox(checked = false, onCheckedChange = null)

            TextField(value = text.value, onValueChange = {
                newString -> text.value = newString
            })
        }
    }
}