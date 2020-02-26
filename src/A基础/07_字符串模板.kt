package A基础

/**
 * A类    名:  `07_字符串模板`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 11:11
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    var a = 1;
    //${变量}
    var s1 = "a is ${a}"
    println(s1)


    //可以去掉{}括号
    var s2 = "a is $a"
    println(s2)

    //调用方法,执行代码块
    var s3 = "调用方法->${hellword()},执行代码块->${s2.replace("is", "was")}"
    println(s3)
}

fun hellword(): String {
    return "hello world"
}