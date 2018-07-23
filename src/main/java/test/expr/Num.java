package test.expr;

public class Num implements Expr {
    private final Integer value;

    public Num(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
