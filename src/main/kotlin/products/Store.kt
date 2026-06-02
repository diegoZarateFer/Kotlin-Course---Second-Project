package products

fun main() {
    val products = ProductsRepository.products;

    val filteredProducts = filter(products) { it.category == ProductCategory.HOME }
    val newPricedProducts = transform(filteredProducts) { it.copy(price = it.price * 2) }
    val formattedProducts = transform(filteredProducts) { "${it.id} - ${it.name} - ${it.price}" }

    for(product in formattedProducts) {
        println(product)
    }
}

fun<R> transform(products: List<Product>, operation: (Product) -> R): List<R> {
    val result = mutableListOf<R>()
    for(product in products) {
        result.add(operation(product))
    }

    return result
}

fun filter(products: List<Product>, isSuitable: (Product) -> Boolean): List<Product> {
    val result = mutableListOf<Product>()
    for(product in products) {
        if(isSuitable(product)) {
            result.add(product)
        }
    }

    return result
}