package C面向对象.A类

/**
 * A类    名:  Kotlin_类_抽象类
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 10:41
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    var person1 = Man()
    var person2 = Woman()
    person1.xiaobian()
    person2.xiaobian()
}

//人
abstract class Person4 {
    //有名字
    var name: String = ""

    //小便
    abstract fun xiaobian(): Unit
}

class Man : Person4() {
    override fun xiaobian() {
        println("我是男的,站着小便")
    }
}

class Woman : Person4() {
    override fun xiaobian() {
        println("我是女的,蹲着小便")
    }
}