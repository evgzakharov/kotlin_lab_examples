package test

fun main(args: Array<String>) {
    val text: String = ClassLoader.getSystemResource("kotlin_getting_started.txt").readText()
    println(text)

//    val linePerSymbolCount: List<Pair<Int, Int>> = linePerSymbolCount()
//    println(linePerSymbolCount)
//
//    val mostPopularSymbols: List<Pair<Char, Int>> = mostPopularSymbols()
//    println(mostPopularSymbols)
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
