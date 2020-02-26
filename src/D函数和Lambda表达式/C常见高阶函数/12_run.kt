package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `12_run`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/9 14:29
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    testRun()
}
fun testRun() {
    // fun <T, R> T.run(f: T.() -> R): R = f()
    "testRun".run {
        println("this = " + this)
    }.let { println(it) }
}
// 运行结果
// this = testRun
// kotlin.Unit