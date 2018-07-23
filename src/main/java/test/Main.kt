package test

val RUB_CURRENCY = "RUB"
val USD_CURRENCY = "USD"

fun main(args: Array<String>) {
    val money1Rub = Money(10.bd(), RUB_CURRENCY)
    val money2Rub = Money(5.bd())

    val sumRub = money1Rub + money2Rub
    println(sumRub.prettyPrint())

    val money1Usd = Money(25.bd(), USD_CURRENCY)
    val money2Usd = Money(5.bd(), USD_CURRENCY)

    val minUsd = money1Usd - money2Usd
    println(minUsd.prettyPrint())
}
