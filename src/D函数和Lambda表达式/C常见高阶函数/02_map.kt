package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `02_map`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:09
 * 描    述： ${TODO}
 */


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5);
    val newList = list.map {
        it * 2 + 3
    }
    newList.forEach(::println) // 输出 5 7 9 11 13
}