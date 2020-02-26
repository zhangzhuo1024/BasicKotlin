package C面向对象.C接口

/**
 * A类    名:  `02_Kotlin_接口中的属性`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 15:29
 * 描    述： ${TODO}
 */

interface MyInterface2 {
    var name: String //name 属性, 抽象的
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}

class Child1 : MyInterface2 {
    override var name: String = "runoob" //重载属性
    override fun bar() {
        // 方法体
        println("bar")
    }
}

fun main(args: Array<String>) {
    val c = Child1()
    c.foo();
    c.bar();
    println(c.name)

}