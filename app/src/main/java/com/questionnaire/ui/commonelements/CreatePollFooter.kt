package com.questionnaire.ui.commonelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.questionnaire.ui.navigation.NavRoute

@Composable
fun CreatePollFooter(navController: NavHostController) {
    BottomAppBar(
        backgroundColor = Color.Cyan,
        elevation = 10.dp,
        contentColor = Color.White
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                navController.navigate(NavRoute.QuestionListScreen.route)
            }) {
                Icon(Icons.Filled.ArrowBack, "Вернуться назад",
                    tint = Color.Black)
            }

            IconButton(onClick = {
                navController.navigate(NavRoute.PollInfoScreen.route)
            }) {
                Icon(Icons.Filled.Info, "Информация об опросе",
                tint = Color.Black)
            }

            IconButton(onClick = {
                navController.navigate(NavRoute.QuestionsScreen.route)
            }) {
                Icon(Icons.Filled.List, "Вопросы",
                tint = Color.Black)
            }
        }
    }
}