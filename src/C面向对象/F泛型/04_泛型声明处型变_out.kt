package C面向对象.F泛型

/**
 * A类    名:  `04_泛型声明处型变`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 10:05
 * 描    述： ${TODO}
 */
// 定义一个支持协变的类
/*
声明处的类型变异使用协变注解修饰符：in、out，消费者 in, 生产者 out。
使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型：
 */
class Runoob<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

fun main(args: Array<String>) {
    var strCo: Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>("b")
    anyCo = strCo
    println(anyCo.foo())   // 输出 a
}
