package C面向对象.I委托

/**
 * A类    名:  `01_类委托`
 * 创 建 者:  伍碧林
 * 创建时间:  2017/7/27 14:14
 * 描    述： ${TODO}
 */
// 创建接口
interface Base {
    fun print()
}

// 实现此接口的被委托的类
class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

// 通过关键字 by 建立委托类
//要干的事情,别人正好能干,只需要把其他对象通过构造方法传递进来就可以了
class Derived(base: Base) : Base by base;


fun main(args: Array<String>) {
    val baseImpl = BaseImpl(10)
    baseImpl.print()

    //创建对象,把真正干事的传递进来
    val derived = Derived(baseImpl)
    derived.print()
}