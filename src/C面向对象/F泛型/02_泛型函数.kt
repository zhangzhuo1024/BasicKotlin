package C面向对象.F泛型

/**
 * A类    名:  `02_泛型推断`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 10:00
 * 描    述： ${TODO}
 */

fun <T> printInfo(content: T) {
    when (content) {
        is Int -> println("传入的$content,是一个Int类型")
        is String -> println("传入的$content,是一个String类型")
        else -> println("传入的$content,不是Int也不是String")
    }
}

fun main(args: Array<String>) {
    printInfo(10)
    printInfo("hello world")
    printInfo(true)
}