package com.larva.demo.demo20200512

fun main() {
    val result1 = add(2, 3, {a, b -> a + b})
    val result2 = add(2, 3) {a, b -> a + b} // result1 과 같은 표현

    println(result1)
    println(result2)
}

fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}