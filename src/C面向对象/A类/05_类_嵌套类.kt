package C面向对象.A类

/**
 * A类    名:  Kotlin_类_嵌套类
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 11:19
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    //创建外部类对象
    var outer = Outer();
    var inner = Outer.Inner();

    //调用方法
    outer.myFun()
    inner.myFun()

}

class Outer {
    var outerVal = 10

    fun myFun() {
        println("outer")
    }

    class Inner {
        fun myFun(): Unit {
            println("Inner")
        }
    }
}