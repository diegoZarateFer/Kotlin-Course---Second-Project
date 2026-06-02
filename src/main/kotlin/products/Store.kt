package products

import extensions.transform

fun main() {
    val products = ProductsRepository.products.filter { it.category == ProductCategory.HOME }
        .transform { it.copy(price = it.price * 2) }.transform { "${it.id} - ${it.name} - ${it.price}" };

    for (product in products) {
        println(product)
    }
}