package C面向对象.D扩展

/**
 * A类    名:  `01_扩展函数`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 16:10
 * 描    述： ${TODO}
 */
class User(var name: String)

//拓展方法
fun User.printUserInfo(): Unit {
    println("我是 ${name}")
}

fun main(args: Array<String>) {
    var user = User("大头儿子")
    user.printUserInfo()
}