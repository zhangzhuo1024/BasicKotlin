package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `03_flatmap`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:09
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    val list = listOf(1..5, 3..8, 10..15)
    val flatList = list.flatMap {
        it
    }
    flatList.forEach(::println) // 输出 1 2 3 4 5 3 4 5 6 7 8 10 11 12 13 14 15
}