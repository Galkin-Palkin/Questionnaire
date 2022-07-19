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
import androidx.navigation.NavController
import com.questionnaire.ui.navigation.NavRoute

@Composable
fun AppFooter(navController: NavController) {
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
                navController.navigate(route = NavRoute.QuestionListScreen.route)
            }, modifier = Modifier.size(64.dp)) {
                Icon(
                    Icons.Filled.List,
                    contentDescription = "Список опросов",
                    tint = Color.Black)
            }

            IconButton(onClick = {
                navController.navigate(route = NavRoute.MainScreen.route)
            }, modifier = Modifier.size(64.dp)) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Главная страница",
                    tint = Color.Black
                )
            }

            IconButton(onClick = {
                navController.navigate(route = NavRoute.UserScreen.route)
            }, modifier = Modifier.size(64.dp)) {
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = "Аккаунт",
                    tint = Color.Black)
            }
        }
    }
}