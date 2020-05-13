package com.larva.demo.demo20200513

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs) // 2차원 배열
    simpleArray.forEach { it.forEach { it2 -> println(it2) }}

    val flattenSimpleArray = simpleArray.flatten() // 단일 배열로 변환하기
    println(flattenSimpleArray)
}