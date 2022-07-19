package com.questionnaire.ui.navigation

sealed class NavRoute(val route: String) {
    object MainScreen: NavRoute("main")

    object QuestionListScreen: NavRoute("question_list")

    object UserScreen: NavRoute("user")

    object CreatePollScreen: NavRoute("create_poll")

    object PollInfoScreen: NavRoute("poll_info")

    object QuestionsScreen: NavRoute("questions")
}
