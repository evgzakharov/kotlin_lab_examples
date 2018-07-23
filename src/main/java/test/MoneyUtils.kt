package test

import java.math.BigDecimal

fun Number.bd(): BigDecimal = BigDecimal(this.toDouble())

fun Money.prettyPrint(): String = when {
    currency == RUB_CURRENCY -> "$value₽"
    currency == USD_CURRENCY -> "$value$"
    else -> "$value $currency"
}
