package aoc.day2

import readInput

/*
--- Day 2: Cube Conundrum ---
 */
fun main() {
    val input = readInput("main/kotlin/resources/Day02.input")
    val game = CubeConundrumGame(input)
    val sum = game.getGameIdSum(false)
    println("What is the sum of the IDs of those games? "
            + sum)

    println("What is the sum of the power of these sets? "
            + game.getGameIdSum(true))
}
