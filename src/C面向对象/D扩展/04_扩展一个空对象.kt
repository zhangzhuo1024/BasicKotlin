package C面向对象.D扩展

/**
 * A类    名:  `04_扩展一个空对象`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 9:50
 * 描    述： ${TODO}
 */
fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}

fun main(arg: Array<String>) {
    var t = null
    println(t.toString())
}