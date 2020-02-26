package C面向对象.F泛型

/**
 * A类    名:  `01_泛型定义`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 9:59
 * 描    述： ${TODO}
 */
class Box<T>(var value: T)

fun main(args: Array<String>) {
    var boxInt = Box<Int>(10)
    var boxStr = Box<String>("string")

    println(boxInt.value)
    println(boxStr.value)
}