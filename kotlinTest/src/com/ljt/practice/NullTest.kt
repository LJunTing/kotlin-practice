package com.ljt.practice


open class person {
//    var age: String? = null
//
//    fun getage(): String {
//        return age?.also {
//            "$age"
//        } ?: "为null"
//    }
//    constructor()

//    lateinit var fsda: String
//
//    val age2 by lazy { read() }
//    open fun read(): String {
//        return "fda"
//    }
}
//
//class student : person() {
//    override fun read(): String {
//        return super.read()
//    }
//
//    companion object {
//
//    }
//
//    inner class A {
//
//    }
//
//}

data class AddT(var name: Int, var age: Int) {
    operator fun plus(a2: AddT): Int {
        return (name + a2.name) + (age + a2.age)
    }
}
fun main() {
    println(AddT(2, 4) + AddT(5, 7))
}

//fun main() {
////    val student: person = student()
////    if (student is student) {
////        student.read()
////    }
//    object : person() {
//        override fun read(): String {
//            return super.read()
//        }
//    }
//    val s = student()
//    val work = object : Runnable {
//        override fun run() {
//        }
//    }
//    Runnable { }
//
//
////    pri/ntln(fieldtest().age)
//
//}
//
//fun checkpermission(): Boolean {
//    return false
//}
//
//fun getleninfo(a: String): Int {
//    return a.length
//}
//
//
//fun checkExp(info: String?) {
//    info ?: throw cusException()
//}

class cusException : IllegalAccessException("出错了")