package A基础

/**
 * A类    名:  `05_01_可变变量定义：var 关键字`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 11:02
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    var a: Int
    var b: String

    //不能重复定义
//    var b:String ="hello";

    //声明的时候赋值
    var c: Int = 1;

    //声明和赋值分开
    var d: Int;
    d = 10;

    //类型自动推断
    var e = 2;

    //var关键字变量可以修改
    e += 1;
}