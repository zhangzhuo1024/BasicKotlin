package B流控语句

/**
 * A类    名:  `Kotlin 循环控制`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 17:03
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    val items = arrayOf(1, 2, 3, 4, 5, "a")
    println("--------最基本的遍历--------")
    for (item in items) {
        println(item)
    }
    println("--------遍历的时候,得到索引--------")
    for (index in items.indices) {
        println("$index->${items[index]}")
    }

    println("--------遍历的时候,得到索引和值--------")
    for ((index, value) in items.withIndex()) {
        println("$index->$value")
    }
}