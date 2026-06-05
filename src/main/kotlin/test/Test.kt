package test

var age: Int? = 20

fun main() {
    exampleWith()
}

inline fun <T> T.myApply(block: T.() -> Unit): T {
    block()
    return this
}

inline fun <T, R> myWith(myObject: T, block: T.() -> R): R {
    return myObject.block()
}

fun exampleApply() {
    mutableListOf<Int>().apply {
        while (true) {
            print("Enter number or 0 to exit: ")
            val num = readln().toInt().takeIf { it != 0 } ?: break
            add(num)
        }
    }.forEach {
        println(it)
    }
}

fun exampleWith() {
    myWith(mutableListOf<Int>()) {
        while (true) {
            print("Enter number or 0 to exit: ")
            val num = readln().toInt().takeIf { it != 0 } ?: break
            add(num)
        }

        println("MAX: ${max()}")
        println("MIN: ${min()}")
    }
}