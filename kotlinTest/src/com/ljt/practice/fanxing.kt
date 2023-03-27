package com.ljt.practice

class KT<T>(val isr: Boolean, val obj: T) {
    fun getobj() = obj.takeIf { isr }
}


inline fun <I, O> map(isMap: Boolean, inputtype: I, inputtype2: (I) -> O) = if (isMap) inputtype2(inputtype) else null

fun main() {
//    KT(true, "dfa").getobj()?.run {
//        print(this.toString())
//    } ?: print("为空")
////    "你好".showInfo()
//
//
//    mapOf("一" to (0))
//    mapOf("一" to 0)
//    "derry".gogogo("m")
//    "derry" gogogo "m"

//   listOf("df").showfileInfo()

    "fa".Myapply {

    }
}

class bianhuan<T>(val isMap: Boolean, val inputtype: T) {
    inline fun <R> map(mapaction: (T) -> R) = mapaction(inputtype).takeIf { isMap }
}

//fun <T> T.showInfo() = print("i${if (this is String) "字符长度:$length" else "你不是字符: $this"}")

fun String?.outputString(defaultV: String) = print(this ?: defaultV)

private infix fun <C1, C2> C1.gogogo(c2: C2) {

    print("第一个参数 : $this")
    print("第二个参数 : $this")


}

//apply 函数实现
//语法形式为 () -> {}，其中 () 用来描述参数列表，{} 用来描述方法体，-> 为 lambda运算符 ，读作(goes to)
//() -> R 不接收任何参数 , 返回的一个R类型的值
//T.() -> R 声明一个带 T类型的接收者的对象不接收任何一个参数 , 返回的一个R类型的值
//而带接收者的lambda表达式则类似对应扩展函数。扩展函数就是这种声明接收者类型，然后使用接收者对象调用直接类似成员函数调用，实际内部是通过这个接收者对象实例直接访问它的方法和属性。
// unit 改 IN 代表扩展函数需要返回值,unit 指扩展函数lambda(IN.() 不用返回值)
fun <IN> IN.Myapply(lambda: IN.() -> Unit): IN {
    lambda(this)
    return this
}