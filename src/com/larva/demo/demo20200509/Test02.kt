package com.larva.demo.demo20200509

data class Person2(var name:String, var age:Int)

lateinit var person1: Person2 // 객체 생성의 지연 초기화

fun main() {
    person1 = Person2("Kildong",30) // 생성자 호출 시점에서 초기화된다
    print(person1.name + " is " + person1.age.toString())
}