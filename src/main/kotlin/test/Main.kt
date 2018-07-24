package test

import java.io.File

fun main(args: Array<String>) {
    /**
     * TASK 1 - WORK WITH COLLECTIONS
     */
    val text: String = ClassLoader.getSystemResource("kotlin_getting_started.txt").readText()
    println(text)

//    val symbolCountPerLine: List<Pair<Int, Int>> = symbolCountPerLine()
//    println(symbolCountPerLine)
//
//    val mostPopularSymbols: List<Pair<Char, Int>> = mostPopularSymbols()
//    println(mostPopularSymbols)

    /**
     * TASK 2 - WORK WITH FILES
     *
     * Try to collect all files to one big file, with next conditions:
     *  1. sorting files in descending order
     *  2. max line length must be 120 symbols, if line exceed try to move to next line
     */

    val filesDir = File(ClassLoader.getSystemResource("files").file)

    val output = File(ClassLoader.getSystemResource("output.txt").file)

    filesDir.walk().forEachIndexed { index, file ->
        println("index=$index file=$file")
    }

    println("output:${output.readText()}")
}

/**
 * @return number of symbols per line (list of line number -> symbols count)
 */
fun symbolCountPerLine(): List<Pair<Int, Int>> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

/**
 * @return find most usages symbols (return only top 10, and sort by descending) (list of char -> find count)
 */
fun mostPopularSymbols(): List<Pair<Char, Int>> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
