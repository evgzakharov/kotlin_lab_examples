package test

import java.util.stream.Collectors

fun main(args: Array<String>) {
    /**
     * sequece
     */
    val sequence = sequenceOf(1, 2, 3)

    val seqResult: Sequence<Int> = sequence.map { it * 2 }

    val collect: List<Int> = seqResult.toList()

    /**
     * list
     */
    val list: List<String> = listOf("1", "2", "3")

    val result: List<String> = list.map { it + it }

    /**
     * stream
     */

    val collectResult: MutableList<String> = list.stream()
        .collect(Collectors.toList())

    /**
     * iteration
     */

    val collection = listOf(1, 2, 3)

    val collectionResult: MutableList<Int> = mutableListOf()
    for (value in collection) {
        collectionResult += value * 5
    }


}