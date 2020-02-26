package C面向对象.D扩展

/**
 * A类    名:  `03_成员函数`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 9:48
 * 描    述： ${TODO}
 */
class C1 {
    fun printInfo() {
        println("成员函数 C1")
    }
}

fun C1.printInfo(): Unit {
    println("拓展函数 C1")
}

fun main(args: Array<String>) {
    var c = C1();
    c.printInfo()
}