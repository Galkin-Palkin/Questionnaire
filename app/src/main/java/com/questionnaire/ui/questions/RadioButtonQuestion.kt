package com.questionnaire.ui.questions

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import com.questionnaire.ui.answervariants.RadioButtonVariant

@Composable
fun RadioButtonQuestion(text: String) {
    Card(
        modifier = Modifier.padding(10.dp).fillMaxSize(),
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5F),
                contentAlignment = Alignment.Center
            ) {
                Text(text)
            }

            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5F),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    RadioButtonVariant("С++")
                    RadioButtonVariant("С#")
                    RadioButtonVariant("Kotlin")
                }
            }
        }
    }
}