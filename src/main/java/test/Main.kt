package test

fun main(args: Array<String>) {
    val user = User(
        "test-user",
        "test-surname",
        "test-patronymic",
        25
    )

    println(user)

    val user2 = User().apply {
        name = "test-user2"
        surname = "test-surname2"
        patronymic = "test-patronymic2"
        age = 55
    }

    println(user2)
}
