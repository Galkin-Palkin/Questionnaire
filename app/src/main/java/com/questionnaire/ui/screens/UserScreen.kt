package com.questionnaire.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.questionnaire.ui.commonelements.AppFooter
import com.questionnaire.ui.commonelements.AppHeader

@Composable
fun UserScreen(navController: NavHostController) {
    Scaffold(
        topBar = { AppHeader("Персональный аккаунт") },
        bottomBar = { AppFooter(navController) }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {

        }
    }
}