package C面向对象.I委托

/**
 * A类    名:  `03_延迟属性 Lazy`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 14:25
 * 描    述： ${TODO}
 */
val lazyValue: String by lazy {
    println("computed!")     // 第一次调用输出，第二次调用不执行
    "Hello"
}

fun main(args: Array<String>) {
    println(lazyValue)   // 第一次执行，执行两次输出表达式
    println(lazyValue)   // 第二次执行，只输出返回值
}