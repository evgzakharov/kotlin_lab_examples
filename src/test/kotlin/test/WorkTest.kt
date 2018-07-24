package test

import org.junit.Assert
import org.junit.Test

class WorkTest {

    val text: String = ClassLoader.getSystemResource("kotlin_getting_started.txt").readText()

    @Test
    fun `test of execution of symbolCountPerLine`() {
        val symbolCountPerLineResult: List<Pair<Int, Int>> = symbolCountPerLine()

        val expectedResult = listOf(
            0 to 19,
            1 to 238,
            2 to 0,
            3 to 425,
            4 to 0,
            5 to 17,
            6 to 405,
            7 to 0,
            8 to 150,
            9 to 0,
            10 to 24,
            11 to 270,
            12 to 0,
            13 to 349
        )

        Assert.assertEquals("error in implementation of symbolCountPerLine ", expectedResult, symbolCountPerLineResult)
    }

    @Test
    fun `test of execution of mostPopularSymbols`() {
        val symbolCountPerLineResult: List<Pair<Char, Int>> = mostPopularSymbols()

        val expectedResult: List<Pair<Char, Int>> = listOf(
            ' ' to 291,
            'e' to 211,
            't' to 131,
            'o' to 119,
            's' to 112,
            'i' to 108,
            'a' to 108,
            'n' to 101,
            'l' to 97,
            'r' to 83
        )

        Assert.assertEquals("error in implementation of symbolCountPerLine ", expectedResult, symbolCountPerLineResult)
    }
}