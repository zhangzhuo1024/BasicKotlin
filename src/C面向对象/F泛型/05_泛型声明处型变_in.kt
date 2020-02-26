package C面向对象.F泛型

/**
 * A类    名:  `05_泛型声明处型变_in`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 10:07
 * 描    述： ${TODO}
 */
// 定义一个支持逆变的类
class Runoob1<in A>(a: A) {
    fun foo(a: A) {
    }
}

fun main(args: Array<String>) {
    var strDCo = Runoob1("a")
    var anyDCo = Runoob1<Any>("b")
    strDCo = anyDCo
}