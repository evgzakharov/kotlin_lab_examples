package test

import java.math.BigDecimal

data class Money(
    val value: BigDecimal,
    val currency: String = RUB_CURRENCY
) {
    operator fun plus(money: Money): Money {
        if (this.currency != money.currency)
            throw RuntimeException(
                String.format(
                    "this currency: %s not same as currency %s",
                    this.currency,
                    money.currency
                )
            )

        return this.copy(value = this.value.add(money.value))
    }

    operator fun minus(money: Money): Money {
        if (this.currency != money.currency)
            throw RuntimeException(
                String.format(
                    "this currency: %s not same as currency %s",
                    this.currency,
                    money.currency
                )
            )

        return this.copy(value = this.value.add(money.value.negate()))
    }
}
