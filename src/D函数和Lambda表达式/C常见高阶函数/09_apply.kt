package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `09_apply`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:15
 * 描    述： ${TODO}
 */
/*
apply函数是这样的，调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象
 */
fun main(args: Array<String>) {
    testApply()
}
fun testApply() {
    // fun <T> T.apply(f: T.() -> Unit): T { f(); return this }
    ArrayList<String>().apply {
        add("testApply")
        add("testApply")
        add("testApply")
        println("this = " + this)
    }.let { println(it) }
}

// 运行结果
// this = [testApply, testApply, testApply]
// [testApply, testApply, testApply]