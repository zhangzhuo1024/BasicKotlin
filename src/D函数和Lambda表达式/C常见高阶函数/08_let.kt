package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `08_let`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:14
 * 描    述： ${TODO}
 */
/*
 首先let()的定义是这样的，
 默认当前这个对象作为闭包的it参数，返回值是函数里面最后一行，或者指定return
 */
fun main(args: Array<String>) {
    testLet()
}

fun testLet(): Int {
    // fun <T, R> T.let(f: (T) -> R): R { f(this)}
    "testLet".let {
        println(it)
        println(it)
        println(it)
        return 1
    }
}
//运行结果
//testLet
//testLet
//testLet