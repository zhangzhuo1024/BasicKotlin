package A基础

/**
 * A类    名:  数组
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 15:32
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    //定义数组方式一:自定义内容,[1,2,3]
    val arr1 = arrayOf(1, 2, 3)
    //定义数组方式一:规则化内容,[0,2,4]
    val arr2 = Array(3, { i -> (i * 2) })

    //数组遍历
    for (i in arr1) {
        println(i)
    }

    for (i in arr2) {
        println(i)
    }
}