package test

import java.time.ZonedDateTime

data class User(
    val name: String,
    val surname: String,
    val patronymic: String,
    val age: Int,

    val created: ZonedDateTime = ZonedDateTime.now()
)

