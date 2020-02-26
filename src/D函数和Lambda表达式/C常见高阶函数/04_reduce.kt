package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `04_reduce`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:11
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    println((0..5).reduce { total, item -> total + item })
    // 输出 15
    //0
    //1
    //2
    //3
    //4
}