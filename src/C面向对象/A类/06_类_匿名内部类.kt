package C面向对象.A类

/**
 * A类    名:  Kotlin_类_内部类
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 11:21
 * 描    述： ${TODO}
 */

interface OnClickListener {
    fun onClick();
}

class Button {
    fun setOnclickListener(listener: OnClickListener): Unit {

    }
}

fun main(args: Array<String>) {
    var btn = Button();
    btn.setOnclickListener(object : OnClickListener {
        override fun onClick() {
            println("按钮被点击了")
        }
    })
}