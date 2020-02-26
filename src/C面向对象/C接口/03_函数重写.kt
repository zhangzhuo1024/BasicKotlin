package C面向对象.C接口

/**
 * A类    名:  `03_Kotlin_函数重写`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/25 15:47
 * 描    述： ${TODO}
 */

interface A {
    fun foo() {
        print("A")
    }   // 已实现
    // 未实现，没有方法体，是抽象的
    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }   // 已实现

    fun bar() {
        print("bar")
    } // 已实现
}


class C : A {
    override fun bar() {
        print("bar")
    }   // 重写
}

/**
 * 这里需要实现两个方法
 */
class D : A, B {
    override fun foo() {
        println("D-Foo()")
    }

    override fun bar() {
        println("D-Bar()")
    }
}


fun main(args: Array<String>) {
    val d = D()
    d.foo();
    d.bar();
}
