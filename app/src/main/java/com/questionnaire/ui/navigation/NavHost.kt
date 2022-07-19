package com.questionnaire.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.questionnaire.ui.screens.*

@Composable
fun NavHost() {
    val navController = rememberNavController()

    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = NavRoute.MainScreen.route) {
        composable(NavRoute.MainScreen.route) { MainScreen(navController) }

        composable(NavRoute.QuestionListScreen.route) { QuestionListScreen(navController) }

        composable(NavRoute.UserScreen.route) { UserScreen(navController) }

        composable(NavRoute.PollInfoScreen.route) { PollInfoScreen(navController)}

        composable(NavRoute.QuestionsScreen.route) { QuestionsScreen(navController)}
    }
}