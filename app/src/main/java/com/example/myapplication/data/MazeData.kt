package com.example.myapplication.data

import com.example.myapplication.model.Position

object MazeData {

    const val LEFT = 1
    const val RIGHT = 2
    const val UP = 4
    const val DOWN = 8
    const val START = 16

    val maze = arrayOf(
        intArrayOf(10, 8, 10, 9),
        intArrayOf(28, 1, 0, 12),
        intArrayOf(12, 10, 9, 13),
        intArrayOf(6, 5, 6, 5)
    )

    fun findStart(): Position {
        for (r in maze.indices) {
            for (c in maze[r].indices) {
                if ((maze[r][c] and START) != 0) {
                    return Position(r, c)
                }
            }
        }
        return Position(0, 0)
    }

    fun value(pos: Position) = maze[pos.row][pos.col]

    private fun mask(pos: Position) = value(pos) and 15

    fun canMoveLeft(p: Position) =
        p.col > 0 && (mask(p) and LEFT) != 0

    fun canMoveRight(p: Position) =
        p.col < maze[0].size - 1 && (mask(p) and RIGHT) != 0

    fun canMoveUp(p: Position) =
        p.row > 0 && (mask(p) and UP) != 0

    fun canMoveDown(p: Position) =
        p.row < maze.size - 1 && (mask(p) and DOWN) != 0
}