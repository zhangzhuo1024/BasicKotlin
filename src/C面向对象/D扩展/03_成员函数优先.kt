package C面向对象.D扩展

/**
 * A类    名:  `03_成员函数`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 9:48
 * 描    述： ${TODO}
 */
class C1 {
    fun foo() {
        println("成员函数")
    }
}

fun C1.foo() {
    println("扩展函数")
}

fun main(arg: Array<String>) {
    var c = C1()
    c.foo()
}