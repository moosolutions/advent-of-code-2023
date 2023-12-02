package aoc.day2

import org.junit.Assert
import org.junit.Test
import readInput

class Day02Test {

    @Test
    fun `What is the sum of the IDs of those games?`() {
        val game = CubeConundrumGame(readInput("test/kotlin/resources/Day02.input"))
        Assert.assertEquals(8, game.getGameIdSum(false))
    }

    @Test
    fun `What is the sum of the power of these sets?`() {
        val game = CubeConundrumGame(readInput("test/kotlin/resources/Day02.input"))
        Assert.assertEquals(2286, game.getGameIdSum(true))
    }

}