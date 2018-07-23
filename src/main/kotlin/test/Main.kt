package test

import java.io.File

fun main(args: Array<String>) {
    /**
     * TASK 1 - WORK WITH COLLECTIONS
     */
    val text: String = ClassLoader.getSystemResource("kotlin_getting_started.txt").readText()
    println(text)

//    val linePerSymbolCount: List<Pair<Int, Int>> = linePerSymbolCount()
//    println(linePerSymbolCount)
//
//    val mostPopularSymbols: List<Pair<Char, Int>> = mostPopularSymbols()
//    println(mostPopularSymbols)

    /**
     * TASK 2 - WORK WITH FILES
     *
     * Try to collect all files to one big file (sorting files in descending order)
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
fun linePerSymbolCount(): List<Pair<Int, Int>> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

/**
 * @return find most usages symbols (return only top 10) (list of char -> find count)
 */
fun mostPopularSymbols(): List<Pair<Char, Int>> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
