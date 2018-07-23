package test;

import static test.Main.RUB_CURRENCY;
import static test.Main.USD_CURRENCY;

public class MoneyUtils {
    public static String prettyPrint(Money money) {
        if (money.getCurrency().equals(RUB_CURRENCY)) {
            return String.format("%s₽", money.getValue());
        } else if (money.getCurrency().equals(USD_CURRENCY)) {
            return String.format("%s$", money.getValue());
        } else {
            return String.format("%s %s", money.getValue(), money.getCurrency());
        }
    }
}
