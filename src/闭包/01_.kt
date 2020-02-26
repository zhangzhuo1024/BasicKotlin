package 闭包

/**
 * 类    名:  `01_`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:18
 * 描    述： ${TODO}
 */
fun add(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}

fun main(args: Array<String>) {
    val add6 = add(6)
    println(add6(6)) // 输出 12
}