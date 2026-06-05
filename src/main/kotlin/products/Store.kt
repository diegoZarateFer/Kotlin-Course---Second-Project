package products

fun main() {
    val products = ProductsRepository.products
        .also { println("Filtering") }
        .filter { it.category == ProductCategory.HOME }
        .also { println("Increasing the price!") }
        .also { println("Formatting") }
        .map { it.copy(price = it.price * 2) }
        .map { "${it.id} - ${it.name} - ${it.price}" }
        .also { println("Printing...") }
        .forEach { println(it) }
}