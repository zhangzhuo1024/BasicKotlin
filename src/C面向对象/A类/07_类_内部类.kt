package C面向对象.A类

/**
 * A类    名:  Kotlin_类_内部类
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 11:21
 * 描    述： ${TODO}
 */

fun main(args: Array<String>) {
    //创建外部类对象
    var outer = Outer1();
    var inner = outer.Inner1();

    //调用方法
    outer.myFun()
    inner.myFun()

}

class Outer1 {
    private var outerVal = 10
    fun myFun() {
        println("outer")
    }

    inner class Inner1 {
        fun myFun(): Unit {
            println("Inner1" + outerVal)
        }
    }
}