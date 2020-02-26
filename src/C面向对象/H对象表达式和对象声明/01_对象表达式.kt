package C面向对象.H对象表达式和对象声明

/**
 * A类    名:  `01_对象表达式`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 14:09
 * 描    述： ${TODO}
 */
object Site {
    var url: String = ""
    val name: String = "黑马程序员"
}

fun main(args: Array<String>) {
    var s1 = Site
    var s2 = Site
    s1.url = "www.itheima.com"
    println(s1.url)
    println(s2.url)
}