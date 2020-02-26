package C面向对象.D扩展

/**
 * A类    名:  `06_伴生对象的扩展`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 9:52
 * 描    述： ${TODO}
 */
class MyClass {
    companion object {}  // 将被称为 "Companion"
}

fun MyClass.Companion.foo() {
    println("伴随对象的扩展函数")
}

val MyClass.Companion.no: Int
    get() = 10

fun main(args: Array<String>) {
    println("no:${MyClass.no}")
    MyClass.foo()
}