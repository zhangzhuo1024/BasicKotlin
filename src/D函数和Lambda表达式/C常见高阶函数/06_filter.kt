package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `06_filter`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:14
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    println((0..5).filter { it % 2 == 1 }) // 输出 [1, 3, 5]
}