package com.larva.demo.demo20200512

fun main() {
    //val box1 = Box(1)         //Box<Int>로 추론
    //val box2 = Box("Hello")   //Box<String>으로 추론
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")

    println(box1.name)
    println(box2.name)
}

class Box<T>(t: T) {  // 제네릭을 사용해 형식 매개변수를 받아 name에 저장
    var name = t
}