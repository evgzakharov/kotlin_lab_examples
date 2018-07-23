package test

class Person {
    operator fun compareTo(person2: Person): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    operator fun rangeTo(person2: Person): ClosedRange<Int> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    operator fun component1(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    operator fun component2(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class Container(
    val value: String,
    val value2: Int,
    val test123: Int
)

fun main(args: Array<String>) {
    val person1 = Person()
    val person2 = Person()

//    person1 < person2

//   person1..person2

    val (name, surname) = person1

    val (value, value2, test123) = method()
}

fun method(): Container {
    /**
     * complex
     */

    return Container("" , 5 , 55)
}