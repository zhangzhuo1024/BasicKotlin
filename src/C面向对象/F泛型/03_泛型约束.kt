package C面向对象.F泛型

/**
 * A类    名:  `03_泛型约束`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 10:00
 * 描    述： ${TODO}
 */
fun <T : Comparable<T>> sort(list: List<T>) {

}


fun main(args: Array<String>) {
    // OK。Int 是 Comparable<Int> 的子类型
    sort(listOf(1, 2, 3))
    // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型
//    sort(listOf(HashMap<Int, String>()))
}
