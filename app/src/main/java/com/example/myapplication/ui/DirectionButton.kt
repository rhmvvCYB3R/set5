package com.example.myapplication.ui

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DirectionButton(
    text: String,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val active = Color(0xFF00E5FF)
    val inactive = Color(0xFF2A2F3A)

    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .size(64.dp)
            .clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (enabled) active else inactive,
            contentColor = Color.Black,
            disabledContainerColor = inactive
        )
    ) {
        Text(text, fontSize = 20.sp)
    }
}