package com.example.myapplication.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.MazeData
import com.example.myapplication.model.Position

@Composable
fun GameScreen(
    position: Position,
    onMove: (Position) -> Unit
) {

    val left = MazeData.canMoveLeft(position)
    val right = MazeData.canMoveRight(position)
    val up = MazeData.canMoveUp(position)
    val down = MazeData.canMoveDown(position)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F1115))
    ) {

        Card(
            modifier = Modifier.align(Alignment.Center),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF1C1F26)
            )
        ) {
            Column(Modifier.padding(20.dp)) {
                Text("Row: ${position.row}", color = Color.White)
                Text("Col: ${position.col}", color = Color.White)
                Text("Value: ${MazeData.value(position)}", color = Color.Cyan)
            }
        }

        DirectionButton(
            text = "▲",
            enabled = up,
            onClick = {
                onMove(Position(position.row - 1, position.col))
            },
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 40.dp)
        )

        DirectionButton(
            text = "▼",
            enabled = down,
            onClick = {
                onMove(Position(position.row + 1, position.col))
            },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp)
        )

        DirectionButton(
            text = "◀",
            enabled = left,
            onClick = {
                onMove(Position(position.row, position.col - 1))
            },
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 40.dp)
        )

        DirectionButton(
            text = "▶",
            enabled = right,
            onClick = {
                onMove(Position(position.row, position.col + 1))
            },
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 40.dp)
        )
    }
}