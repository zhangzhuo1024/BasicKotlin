package C面向对象.B继承


/**
 * A类    名:  Kotlin_类_内部类
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 11:21
 * 描    述： ${TODO}
 */
open class Person02(var name: String) {

}

class Student02 : Person02 {
    var age = 0
    var score = 0

    //需要在次构函数中处理基类的主构函数
    constructor(name: String, age: Int, score: Int) : super(name) {
        this.age = age
        this.score = score
    }

    fun printInfo(): Unit {
        println("我是$name,我${age}岁,我考试得了${score}分")
    }
}

fun main(args: Array<String>) {
    var xiaoming = Student02("小名", 20, 99)
    xiaoming.printInfo()
}