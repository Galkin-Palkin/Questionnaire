package com.questionnaire.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.questionnaire.ui.commonelements.AppHeader
import com.questionnaire.ui.commonelements.CreatePollFooter

@Composable
fun QuestionsScreen(navController: NavHostController) {
    Scaffold(
        topBar = { AppHeader("Добавление вопросов") },
        bottomBar = { CreatePollFooter(navController = navController) }
    ) {

    }
}