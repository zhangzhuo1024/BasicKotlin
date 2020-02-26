package D函数和Lambda表达式.C常见高阶函数

import java.io.BufferedReader
import java.io.FileReader

/**
 * 类    名:  `11_use`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/7 11:17
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {

    //古老方法
    BufferedReader(FileReader("hello.txt")).use {
        var line: String?
        while (true) {
            line = it.readLine() ?: break // 注意是用 it 调用
            println(line)
        }
    }
    //简单方式
    val br = BufferedReader(FileReader("hello.txt")).readText()
}
