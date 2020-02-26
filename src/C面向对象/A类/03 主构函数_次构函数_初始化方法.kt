package C面向对象.A类

/**
 * A类    名:  `Kotlin B继承`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 9:16
 * 描    述： ${TODO}
 */

fun main(args: Array<String>) {
    //主构函数创建对象
    var datouerzi = Person3("大头儿子", 8)
    datouerzi.printInfo()

    //次构函数
    var xtbb = Person3("大头爸爸", 28, "深圳")
    xtbb.printInfo()
}

//定义类+主构函数
class Person3(name: String, age: Int) {
    var name: String = name
    var age = age
    var city = "中国"

    //初始化方法-->主构函数完成之后被调用
    init {
        println("初始化方法被调用,姓名:$name,年龄:$age,城市:$city")
    }


    //次构函数-->在初始化函数之后被执行
    constructor(name: String, age: Int, city: String) : this(name, age) {
        this.city = city
    }

    fun printInfo(): Unit {
        println("我是$name,我${age}岁,我在$city")
    }
}

//主构函数中,定义成员属性
// 次构函数不能直接定义成员属性
class Person03(var name: String, var age: Int) {
    fun printInfo(): Unit {
        println("我是$name,我${age}岁")
    }

    var score = 0;

    constructor(name: String, age: Int, score: Int) : this(name, age) {
        this.score = score;
    }
}