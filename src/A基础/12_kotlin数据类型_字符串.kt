package A基础

/**
 * A类    名:  字符串
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/24 15:43
 * 描    述： ${TODO}
 */
fun main(args: Array<String>) {
    var str1: String = "aaaaaaaaaaaa";
    var str2:String = "bbbbbbbbbbbbb"


    //遍历字符串,意义不大
    for (c in str1) {
//        println(c)
    }



    //三个引号 """包起来的字符串，支持多行
    val str3 = """
    多行字符串
    多行字符串
    """
//    println(str3)   // 输出有一些前置空格



    //String 可以通过 trim() 方法来删除多余的空白。
    var str4 = "  内容  "
    println(str4.trim())

    //String 可以通过 trimMargin("|") 方法来删除"前导空格"
    //前导空格:变量前面的空格
    var str5 = "  |内容|内容|内容|内容  "
    println(str5)
}