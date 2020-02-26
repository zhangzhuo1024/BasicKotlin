package A基础

/**
 * A类    名:  `函数的变长参数可以用 vararg 关键字进行标识`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 10:57
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    fun myFun(vararg a:Int) {
        for (i in a) {
            println(i)
        }
    }
    myFun(1,2,3,4)
}