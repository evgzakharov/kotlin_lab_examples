package test;

import java.math.BigDecimal;

import static test.Main.RUB_CURRENCY;

public class Money {
    private final BigDecimal value;
    private final String currency;

    private static final String DEFAULT_CURRENCY = RUB_CURRENCY;

    public Money(BigDecimal value) {
        this.value = value;
        this.currency = DEFAULT_CURRENCY;
    }

    public Money(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public Money add(Money money) {
        if (!this.currency.equals(money.currency))
            throw new RuntimeException(String.format("this currency: %s not same as currency %s", this.currency, money.currency));

        return new Money(this.value.add(money.value), this.currency);
    }

    public Money minus(Money money) {
        if (!this.currency.equals(money.currency))
            throw new RuntimeException(String.format("this currency: %s not same as currency %s", this.currency, money.currency));

        return new Money(this.value.add(money.value.negate()), this.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "value=" + value +
                ", currency='" + currency + '\'' +
                '}';
    }
}
