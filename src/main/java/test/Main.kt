package test

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int = when (expr) {
    is Num -> expr.value
    is Sum -> eval(expr.left) + eval(expr.right)
    else -> throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    val expr = Sum(Num(3), Num(2))

    println(eval(expr))
}