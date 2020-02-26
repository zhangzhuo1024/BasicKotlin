package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `00_高阶函数认识`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:25
 * 描    述： ${TODO}
 */
/*
  将函数作为参数或返回一个函数，称为高阶函数。
 */
fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}

fun main(args: Array<String>) {
    var items = listOf(1, 2, 3, 4, 5, 6)
    items.map {
        println(it)
    }
}
