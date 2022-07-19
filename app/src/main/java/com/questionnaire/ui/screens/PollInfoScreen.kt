package com.questionnaire.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.questionnaire.ui.commonelements.AppHeader
import com.questionnaire.ui.commonelements.CreatePollFooter
import com.questionnaire.ui.navigation.NavRoute

@Composable
fun PollInfoScreen(navController: NavHostController) {
    Scaffold(
        topBar = { AppHeader("Информация об опросе")},
        bottomBar = { CreatePollFooter(navController = navController) }
    ) {

    }
}