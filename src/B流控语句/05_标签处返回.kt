package B流控语句

/**
 * A类    名:  标签处返回
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 17:19
 * 描    述： ${TODO}
 */

fun main(args: Array<String>) {
    //定义标签
    loop@ for (i in 1..4) {
        for (j in 1..4) {
            if (i == 2 && j == 2) {
                //break到指定标签
                break@loop
            }
            println("i = $i, j = $j")
        }
    }
}