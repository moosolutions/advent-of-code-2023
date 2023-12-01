package aoc.day1

import readInput

/*
--- Day 1: Trebuchet ---
 */
fun main() {
    val input = readInput("main/kotlin/resources/Day01.input")
    val trebuchet = Trebuchet(input)
    val sum = trebuchet.calibrationValuesSum()
    println("What is the sum of all of the calibration values? "
            + sum)

    println("What is the real sum of all of the calibration values? "
            + trebuchet.realCalibrationValuesSum())
}
