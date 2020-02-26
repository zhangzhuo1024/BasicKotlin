package A基础

/**
 * A类    名:  `04_01_表达式作为函数体，返回类型自动推断`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 10:31
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    myFun4()
    myFun5(1,1)
    println(myFun6(1,1))
}

/*
fun myFun4() {
    print("myFun4")
}*/
fun myFun4() = println("myFun4")

/*fun myFun5(a: Int, b: Int) {
    print("a:" + a + " b:" + b)
}*/
fun myFun5(a: Int, b: Int) = println("a:" + a + " b:" + b)

/*fun myFun6(a: Int, b: Int): Int {
    return a + b;
}*/
fun myFun6(a: Int, b: Int): Int = a + b

//返回类型自动推断
//fun myFun6(a: Int, b: Int) = a + b

