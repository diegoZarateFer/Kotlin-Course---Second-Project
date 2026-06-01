package test

import java.io.File

val numbers = mutableListOf<Int>()

fun main() {
    println(sum(8,7))
}

//fun sum(a: Int): Int {
//    val file = File("tests.txt")
//    val num = file.readText().trim().toInt()
//    return a + num
//}

fun sum(a: Int, b: Int): Int {
    val result = a + b
    numbers.add(result)
    return result
}

//fun sum(a: Int, b: Int): Int {
//    return a + b;
//}