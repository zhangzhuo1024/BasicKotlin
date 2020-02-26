package C面向对象.C接口

/**
 * A类    名:  `01_Kotlin_接口定义和实现`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 15:29
 * 描    述： ${TODO}
 */
interface MyInterface01 {
    //必须被覆写
    fun myFun1();
    fun myFun2() {
        println("myFun2")
    }
}
class MyClass01 :MyInterface01{
    override fun myFun1() {
        println("myFun1")
    }
}

fun main(args: Array<String>) {
    var myClass01 = MyClass01()
    myClass01.myFun1()
    myClass01.myFun2()
}