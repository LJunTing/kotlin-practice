package com.ljt.practice.com

import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit


fun main() {
//    val listOf = listOf(
//        listOf(listOf("fa", "dfs", "c"), listOf("asf", "k", "ghj"), listOf("ytu", "tyu", "m"))
//        , listOf(listOf("fa", "dfs", "c"), listOf("asf", "k", "ghj"), listOf("ytu", "tyu", "m"))
//    )
//    println(listOf.flatMap {
//        print("执行了$it ]\n")
//        it.flatMap {
//            it
//        }
//    })
    val executor = ThreadPoolExecutor(5, 9, 5000, TimeUnit.SECONDS, SynchronousQueue())
    executor.execute {
        println(Thread.currentThread().name + "---" + singletonTest.getinstance())
    }

    executor.execute {
        println(Thread.currentThread().name + "---" + singletonTest.getinstance())
    }

    executor.execute {
        println(Thread.currentThread().name + "---" + singletonTest.getinstance())
    }

    executor.execute {
        println(Thread.currentThread().name + "---" + singletonTest.getinstance())
    }

    executor.shutdown()

}

class singletonTest {
    object Holder {
        val instance: singletonTest = singletonTest()
    }

    companion object {
        fun getinstance() = Holder.instance

        val instance1: singletonTest by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { singletonTest() }
    }
}

