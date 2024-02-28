package main2

fun main(){//fun函式
    println("hello")
    Person().hello()//與java不同的是省略了new關鍵詞
    val p =Person()
    p.hello()//同理
}


class Person(){
    fun hello(){
        println("hello")
    }
}