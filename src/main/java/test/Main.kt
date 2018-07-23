package test

interface Form {
    var h: Int?
    var w: Int?
    var l: Int?
}

class Table : Form {
    override var h: Int? = null
    override var w: Int? = null
    override var l: Int? = null
    var name: String? = null

    override fun toString(): String {
        return "h=$h w=$w l=$l name=$name"
    }
}

fun Table.test() {
    val form: Table = this
}

fun main(args: Array<String>) {
    val table: Table = Table().apply {
        name = "123"
        h = 44
        w = 55
    }

    println(table)

    val table2: Int = Table().run {
        name = "123"
        h = 44
        w = 55
        123
    }

    println(table2)

    val table3: Table = Table().also {
        it.name = "123"
        it.h = 44
        it.w = 55
    }

    println(table3)

    val table4: Int = Table().let {
        it.name = "123"
        it.h = 44
        it.w = 55
        123
    }

    println(table4)

    /**
     * nullable examples
     */

    val value: Int? = 123

    if (value != null) {
        println(value)
    }

    val let2: Int? = value
        ?.let { it * 2 }

    val let3: String? = let2?.let { it.toString() }

    println("let2=$let2")
    println("let3=$let3")
}
