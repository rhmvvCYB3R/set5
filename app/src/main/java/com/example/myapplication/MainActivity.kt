package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.myapplication.data.MazeData
import com.example.myapplication.model.Position
import com.example.myapplication.ui.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MazeApp()
        }
    }
}

enum class Screen {
    MENU, GAME, RESULT
}

@Composable
fun MazeApp() {

    var screen by remember { mutableStateOf(Screen.MENU) }
    var pos by remember { mutableStateOf(MazeData.findStart()) }

    when (screen) {

        Screen.MENU -> {
            MenuScreen {
                pos = MazeData.findStart()
                screen = Screen.GAME
            }
        }

        Screen.GAME -> {
            GameScreen(
                position = pos,
                onMove = { newPos ->
                    pos = newPos

                    if (MazeData.value(pos) == 0) {
                        screen = Screen.RESULT
                    }
                }
            )
        }

        Screen.RESULT -> {
            ResultScreen(
                onRestart = {
                    pos = MazeData.findStart()
                    screen = Screen.GAME
                },
                onMenu = {
                    screen = Screen.MENU
                }
            )
        }
    }
}