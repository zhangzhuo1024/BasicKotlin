package D函数和Lambda表达式.C常见高阶函数

/**
 * 类    名:  `05_fold`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:13
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    println((0..5).fold(5) { acc, i -> acc + i }) // 输出 20
    println((0..5).fold(StringBuilder()) { acc, i -> acc.append(i).append(",") }) // 输出 0,1,2,3,4,5,
}