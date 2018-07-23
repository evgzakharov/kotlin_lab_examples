package test

fun main(args: Array<String>) {
    val list = listOf("1", "2", "3")

    val listConcat = concatToString(list)
    println(listConcat)

    val listConcat2 = concatToString(list, ":")
    println(listConcat2)

    val listConcat3 = concatToString(list, ":", "suffix")
    println(listConcat3)

    val listConcat4 = concatToString(list, ":", "prefix", "suffix")
    println(listConcat4)
}
