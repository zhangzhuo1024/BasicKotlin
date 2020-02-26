package C面向对象.C接口

/**
 * A类    名:  `01_Kotlin_接口定义和实现`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 15:29
 * 描    述： ${TODO}
 */
interface MyInterface {
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}

class Child : MyInterface {
    override fun bar() {
        // 方法体
        println("bar")
    }
}

fun main(args: Array<String>) {
    val c = Child()
    c.foo();
    c.bar();
}