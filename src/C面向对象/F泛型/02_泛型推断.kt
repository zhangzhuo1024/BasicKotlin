package C面向对象.F泛型

/**
 * A类    名:  `02_泛型推断`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 10:00
 * 描    述： ${TODO}
 */

fun main(args: Array<String>) {
    val age = 23
    val name = "itheia"
    val bool = true

    doPrintln(age)    // 整型
    doPrintln(name)   // 字符串
    doPrintln(bool)   // 布尔型
}

fun <T> doPrintln(content: T) {
    when (content) {
        is Int -> println("整型数字为 $content")
        is String -> println("字符串转换为大写：${content.toUpperCase()}")
        else -> println("T 不是整型，也不是字符串")
    }
}