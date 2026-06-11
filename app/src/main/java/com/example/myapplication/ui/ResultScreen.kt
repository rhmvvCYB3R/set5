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
fun ResultScreen(
    onRestart: () -> Unit,
    onMenu: () -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F1115)),
        contentAlignment = Alignment.Center
    ) {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF1C1F26)
            ),
            modifier = Modifier.padding(24.dp)
        ) {

            Column(
                modifier = Modifier.padding(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "YOU WIN!",
                    fontSize = 30.sp,
                    color = Color(0xFF00E5FF)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "You reached the exit room (value = 0)",
                    color = Color.LightGray,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(onClick = onRestart) {
                    Text("Restart")
                }

                Spacer(modifier = Modifier.height(10.dp))

                Button(onClick = onMenu) {
                    Text("Back to Menu")
                }
            }
        }
    }
}