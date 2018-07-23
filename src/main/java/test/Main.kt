package test

val RUB_CURRENCY = "RUB"
val USD_CURRENCY = "USD"

fun main(args: Array<String>) {
    val money1Rub = 10.toMoney()
    val money2Rub = 5.toMoney(RUB_CURRENCY)

    val sumRub = money1Rub + money2Rub
    println(sumRub.prettyPrint())

    val money1Usd = 25.toMoney(USD_CURRENCY)
    val money2Usd = 5.toMoney(currency = USD_CURRENCY)

    val minUsd = money1Usd - money2Usd
    println(minUsd.prettyPrint())
}
