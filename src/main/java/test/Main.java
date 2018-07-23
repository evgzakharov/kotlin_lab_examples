package test;

import test.expr.Expr;
import test.expr.Num;
import test.expr.Sum;

public class Main {
    public static int eval(Expr expr) {
        if (expr instanceof Num) {
            return ((Num) expr).getValue();
        }
        if (expr instanceof Sum) {
            Sum sum = (Sum) expr;
            return eval(sum.getLeft()) + eval(sum.getRight());
        }
        throw new IllegalArgumentException("Unknown expression");
    }

    public static void main(String[] args) {
        Expr expr = new Sum(new Num(3), new Num(2));

        System.out.println(eval(expr));
    }
}
