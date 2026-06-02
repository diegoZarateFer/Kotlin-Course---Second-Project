package extensions

inline fun <T,R> Iterable<T>.transform(operation: (T) -> R): List<R> {
    val result = mutableListOf<R>()
    for (product in this) {
        result.add(operation(product))
    }

    return result
}

inline fun <T> Iterable<T>.filter(isSuitable: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (person in this) {
        if (isSuitable(person)) {
            result.add(person)
        }
    }
    return result
}