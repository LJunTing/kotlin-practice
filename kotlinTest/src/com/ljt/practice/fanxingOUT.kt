package com.ljt.practice


interface Producer1<out T> {
    fun prodecer(): T
}

open class Animal
open class Humanity : Animal()
open class Woman : Humanity()
open class Man : Humanity()
class producerclass2 : Producer1<Animal> {
    override fun prodecer(): Animal {
        return Animal()
    }
}

class producerclass1 : Producer1<Woman> {
    override fun prodecer(): Woman {
        return Woman()
    }
}

fun main() {
//    //producerclass2 : Producer1<Animal>
//    val p1: Producer1<Animal> = producerclass2()
//    //producerclass1 : Producer1<Woman>
//    val p2: Producer1<Animal> = producerclass1()

//    listOf(12).minWith()

    println("\n 选出来:"+randomDefault<String> {
        "默认"
    })

}

inline fun <reified T> randomDefault(default: () -> T): T? {
    val listOf = listOf("sdfa", 234, true)
    val randomobj = listOf.shuffled().first()
    print("随机$randomobj")
    return randomobj.takeIf { it is T }   as T? ?: default()
}