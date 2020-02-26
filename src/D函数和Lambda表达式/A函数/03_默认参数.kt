package D函数和Lambda表达式.A函数

/**
 * 类    名:  `03_默认参数`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/3 11:13
 * 描    述： ${TODO}
 */


fun printfInfo(name: String = "billy", age: Int = 19): Unit {
    println("我是$name,我今年$age 岁")
}

fun main(args: Array<String>) {
    //默认参数可以不用传递
    printfInfo()
}