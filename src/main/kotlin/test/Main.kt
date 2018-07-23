package test

fun main(args: Array<String>) {
    val text: String = ClassLoader.getSystemResource("kotlin_getting_started.txt").readText()

    println(text)
}
