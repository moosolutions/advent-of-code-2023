package aoc.day1

import org.junit.Assert
import org.junit.Test
import readInput

class Day01Test {

    @Test
    fun `What is the sum of all of the calibration values?`() {
        val trebuchet = Trebuchet(readInput("test/kotlin/resources/Day01.input"))
        Assert.assertEquals(142, trebuchet.calibrationValuesSum())
    }

    @Test
    fun `What is the real sum of all of the calibration values?`() {
        val trebuchet = Trebuchet(readInput("test/kotlin/resources/Day01Part2.input"))
        Assert.assertEquals(281, trebuchet.realCalibrationValuesSum())
    }

}