package C面向对象.E数据类与包装类

/**
 * A类    名:  数据类
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 9:55
 * 描    述： ${TODO}
 */
data class User(val name:String,val age:Int)

fun main(args: Array<String>) {
    val jack = User("Jack",20)
    val olderJack = User("OldJack",60)

    //默认封装好了toString方法
    println(jack)
    println(olderJack)
}