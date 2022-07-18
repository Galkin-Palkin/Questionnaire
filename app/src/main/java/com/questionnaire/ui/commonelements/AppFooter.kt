package com.questionnaire.ui.commonelements

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.sharp.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppFooter() {
    BottomAppBar(
        backgroundColor = Color.Cyan,
        contentColor = Color.White,
        elevation = 10.dp
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            IconButton(onClick = {

            }, modifier = Modifier.size(64.dp)) {
                Icon(
                    Icons.Filled.List,
                    contentDescription = "Список опросов",
                    tint = Color.White)
            }

            IconButton(onClick = {

            }, modifier = Modifier.size(64.dp)) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Главная страница",
                    tint = Color.White
                )
            }

            IconButton(onClick = {

            }, modifier = Modifier.size(64.dp)) {
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = "Аккаунт",
                    tint = Color.White)
            }
        }
    }
}