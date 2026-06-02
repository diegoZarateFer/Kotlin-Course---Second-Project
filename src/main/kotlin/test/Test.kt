package test

var age: Int? = 20

fun main() {
    val result = age?.myLet {
        if(it >= 18) {
            "You are an adult"
        } else {
            "You will be an adult in ${18 - it} years."
        }
    }

   result?.myLet { println(it) }
}

inline fun <T, R> T.myLet(block: (T) -> R): R {
    return block(this)
}