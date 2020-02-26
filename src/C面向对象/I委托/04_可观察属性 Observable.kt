package C面向对象.I委托

/**
 * A类    名:  `04_可观察属性 Observable`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 14:26
 * 描    述： ${TODO}
 */
import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("默认值") {
        prop, old, new ->
        println(prop)
//        println("旧值：$old -> 新值：$new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}