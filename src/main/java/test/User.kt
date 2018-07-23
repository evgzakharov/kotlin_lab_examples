package test

import java.time.ZonedDateTime

data class User(
    var name: String? = null,
    var surname: String? = null,
    var patronymic: String? = null,
    var age: Int? = null,

    var created: ZonedDateTime = ZonedDateTime.now()
)
