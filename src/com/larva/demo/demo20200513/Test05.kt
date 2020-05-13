package com.larva.demo.demo20200513

fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}