package C面向对象.I委托

/**
 * A类    名:  `05_把属性储存在映射中`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 14:27
 * 描    述： ${TODO}
 */
class Site(val map: Map<String, Any?>) {
    val name: String by map
    val url: String  by map
}

fun main(args: Array<String>) {
    // 构造函数接受一个映射参数
    val site = Site(mapOf(
            "name" to "黑马程序员",
            "url" to "www.itheima.com"
    ))

    // 读取映射值
    println(site.name)
    println(site.url)
}