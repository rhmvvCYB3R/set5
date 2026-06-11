package com.example.myapplication.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen(onStart: () -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F1115)),
        contentAlignment = Alignment.Center
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF1C1F26)
            )
        ) {
            Column(
                modifier = Modifier.padding(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("MAZE GAME", fontSize = 26.sp, color = Color.White)

                Spacer(Modifier.height(20.dp))

                Button(onClick = onStart) {
                    Text("START")
                }
            }
        }
    }
}