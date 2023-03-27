package com.ljt.practice.com


fun main() {

}

class RXJavaCoreClassObject<T>(var valueitem: T)

inline fun <I, O> RXJavaCoreClassObject<I>.map(action1: I.() -> O) = RXJavaCoreClassObject(action1(valueitem))

inline fun <T> RXJavaCoreClassObject<T>.observer(action: T.() -> Unit) = action(valueitem)

inline fun <OUTPUT> create(action: () -> OUTPUT) = RXJavaCoreClassObject(action())