package C面向对象.E数据类与包装类

/**
 * A类    名:  `02_密封类`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 9:57
 * 描    述： ${TODO}
 */

sealed class Expr

data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}