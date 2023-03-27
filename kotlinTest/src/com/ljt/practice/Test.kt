package com.ljt.practice


fun main() {
    //匿名函数
    showPersonInfo("战三", 18) { result ->
        print("结果: $result")
    }
    //具名函数
    showPersonInfo("丽斯", 49, ::showResultImp)

}
fun showResultImp(result: String) {
    print("具名:$result")

}
fun showPersonInfo(name: String, aget: Int, Result: (String) -> Unit) {
    Result("name:$name,age:$aget")
}


