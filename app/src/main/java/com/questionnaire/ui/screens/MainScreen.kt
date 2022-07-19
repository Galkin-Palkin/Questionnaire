package com.questionnaire.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.questionnaire.ui.commonelements.AppFooter
import com.questionnaire.ui.commonelements.AppHeader
import com.questionnaire.ui.navigation.NavHost

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = { AppHeader("Опросник") },
        bottomBar = { AppFooter(navController) }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

            }
        }
    }
}