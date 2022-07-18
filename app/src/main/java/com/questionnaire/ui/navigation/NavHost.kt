package com.questionnaire.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.questionnaire.ui.screens.QuestionListScreen
import com.questionnaire.ui.screens.StartScreen
import com.questionnaire.ui.screens.UserScreen

@Composable
fun NavHost() {
    val navController = rememberNavController()

    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = NavRoute.StartScreen.route) {
        composable(NavRoute.StartScreen.route) { StartScreen(navController) }

        composable(NavRoute.QuestionListScreen.route) { QuestionListScreen(navController) }

        composable(NavRoute.UserScreen.route) { UserScreen(navController) }
    }
}