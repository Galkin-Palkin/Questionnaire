package com.questionnaire.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.questionnaire.R
import com.questionnaire.ui.commonelements.AppHeader
import com.questionnaire.ui.commonelements.CreatePollFooter
import com.questionnaire.ui.navigation.NavRoute

@Composable
fun PollInfoScreen(navController: NavHostController) {
    val pollName = remember {
        mutableStateOf("My VM here (poll name)")
    }

    Scaffold(
        topBar = { AppHeader("Информация об опросе")},
        bottomBar = { CreatePollFooter(navController = navController) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().height(60.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Название опроса:")
            }

            Box(
                modifier = Modifier.fillMaxWidth().height(80.dp),
                contentAlignment = Alignment.Center
            ) {
                TextField(
                    modifier = Modifier.fillMaxSize().padding(15.dp),
                    value = pollName.value,
                    onValueChange = {
                        newText -> pollName.value = newText
                    }
                )
            }

            Box(
                modifier = Modifier.fillMaxWidth().height(60.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Аватар опроса:")
            }

            Image(
                modifier = Modifier.weight(1f).fillMaxWidth().padding(20.dp),
                bitmap = ImageBitmap.imageResource(R.drawable.poll_picture),
                contentDescription = "",
                contentScale = ContentScale.FillBounds
            )
        }
    }
}