package products

fun main() {
    val products = ProductsRepository.products.filter { it.category == ProductCategory.HOME }
        .transform { it.copy(price = it.price * 2) }.transform { "${it.id} - ${it.name} - ${it.price}" };

    for (product in products) {
        println(product)
    }
}

fun <R> List<Product>.transform(operation: (Product) -> R): List<R> {
    val result = mutableListOf<R>()
    for (product in this) {
        result.add(operation(product))
    }

    return result
}

fun List<Product>.filter(isSuitable: (Product) -> Boolean): List<Product> {
    val result = mutableListOf<Product>()
    for (product in this) {
        if (isSuitable(product)) {
            result.add(product)
        }
    }

    return result
}