package 测试

/**
 * 类    名:  类委托
 * 创 建 者:  伍碧林
 * 创建时间:  2017/8/9 13:22
 * 描    述： ${TODO}
 */
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print() // 输出 10
}
