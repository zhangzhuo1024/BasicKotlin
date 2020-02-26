package C面向对象
//父类
open class TestB {
    open var x: Int? = null //属性x
        get() {//重写了get方法，此处后面详解
            field = 34
            return field
        }
}

class TestA() : TestB() {
    override var x: Int? = null //它覆盖对应属性后，对应的方法也被覆盖
}

fun main(args: Array<String>) {
    var a = TestA()
    println(a.x)

    var b = TestB()
    println(b.x)
}