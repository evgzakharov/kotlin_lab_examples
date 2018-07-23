package test.expr;

public class Sum implements Expr {
    private final Expr left;
    private final Expr right;

    public Sum(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    public Expr getLeft() {
        return left;
    }

    public Expr getRight() {
        return right;
    }
}
