package C面向对象.G枚举

/**
 * A类    名:  `01_枚举定义`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 14:04
 * 描    述： ${TODO}
 */
enum class Week {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

fun printInfo(c: Week): Unit {
    when (c) {
        Week.MON -> println("今天是 星期一")
        Week.TUE -> println("今天是 星期二")
        Week.WED -> println("今天是 星期三")
        Week.THU -> println("今天是 星期四")
        Week.FRI -> println("今天是 星期五")
        Week.SAT -> println("今天是 星期六")
        Week.SUN -> println("今天是 星期日")
    }
}

fun main(args: Array<String>) {
    printInfo(Week.MON)

    println("--------遍历集合--------")
    for (value in Week.values()) {
        println(value.name)
    }

    println(Week.MON.name)
    println(Week.MON.ordinal)
}






