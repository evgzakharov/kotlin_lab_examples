package test;

import java.math.BigDecimal;

import static test.MoneyUtils.prettyPrint;

public class Main {
    public static final String RUB_CURRENCY = "RUB";
    public static final String USD_CURRENCY = "USD";

    public static void main(String[] args) {
        Money money1Rub = new Money(new BigDecimal(10), RUB_CURRENCY);
        Money money2Rub = new Money(new BigDecimal(5));

        Money sumRub = money1Rub.add(money2Rub);
        System.out.println(prettyPrint(sumRub));

        Money money1Usd = new Money(new BigDecimal(25), USD_CURRENCY);
        Money money2Usd = new Money(new BigDecimal(5), USD_CURRENCY);

        Money minUsd = money1Usd.minus(money2Usd);
        System.out.println(prettyPrint(minUsd));
    }
}
