package C面向对象.H对象表达式和对象声明

/**
 * A类    名:  `01_对象表达式`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 14:09
 * 描    述： ${TODO}
 */
object Site {
    var url: String = "";
    var name: String = ""
}

fun main(args: Array<String>) {
    var s1 = Site
    var s2 = Site

    s1.url = "www.ithiema.com"
    s1.name = "黑马程序员"

    s2.url = "www.itcast.cn"
    s2.name = "传智播客"

    println(s1.name)
    println(s2.name)
}