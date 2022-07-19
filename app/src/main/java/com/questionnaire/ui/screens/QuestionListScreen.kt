package com.questionnaire.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.questionnaire.ui.commonelements.AppFooter
import com.questionnaire.ui.commonelements.AppHeader
import com.questionnaire.ui.navigation.NavRoute

@Composable
fun QuestionListScreen(navController: NavHostController) {
    Scaffold(
        topBar = { AppHeader("Список опросов") },
        bottomBar = { AppFooter(navController) }
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {

            }

            Box(
                modifier = Modifier.fillMaxWidth().height(96.dp),
                contentAlignment = Alignment.CenterEnd
            ) {
                OutlinedButton(
                    modifier = Modifier.padding(16.dp).size(64.dp),
                    shape = CircleShape,
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color.Green,
                        contentColor = Color.White
                    ),
                    contentPadding = PaddingValues(0.dp),
                    onClick = {
                        navController.navigate(NavRoute.PollInfoScreen.route)
                    }
                ) {
                    Icon(
                        Icons.Filled.Add,
                        "Создать опрос",
                    )
                }
            }
        }
    }
}