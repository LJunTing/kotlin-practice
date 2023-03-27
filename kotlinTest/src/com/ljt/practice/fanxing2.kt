package com.ljt.practice

class KT2<T>(vararg arrs: T, var ismap: Boolean) {
    //out T 只能读不能修改
    private val arrsthis: Array<out T> = arrs

   operator fun get(index: Int): T? = arrsthis[index].takeIf { ismap }
    //takeIf 可能为null
    fun <O> map(index: Int, aciton: (T?) -> O) = aciton(arrsthis[index].takeIf { ismap })
}
fun main() {
    println(KT2("打发打发", 1231, "Dfa", ismap = true).get(0))
    println(KT2("打发打发", 1231, "Dfa", ismap = true)[0])

    println(KT2("打发打发", 1231, "Dfa", ismap = true).map(1) {
        it.toString()
    })

}