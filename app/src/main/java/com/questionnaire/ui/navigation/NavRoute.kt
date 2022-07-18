package com.questionnaire.ui.navigation

sealed class NavRoute(val route: String) {
    object StartScreen: NavRoute("start")

    object QuestionListScreen: NavRoute("question_list")

    object UserScreen: NavRoute("user")
}
