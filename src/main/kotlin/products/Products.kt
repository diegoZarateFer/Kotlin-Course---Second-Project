package products

fun main() {
    var products = ProductsRepository.products;
    products = filter(products,FoodFilterCategory)
    products = filter(products,PriceFilter)

    for(product in products) {
        println(product)
    }
}

fun filter(products: List<Product>, condition: Condition): List<Product> {
    val result = mutableListOf<Product>()
    for(product in products) {
        if(condition.isSuitable(product)) {
            result.add(product)
        }
    }

    return result
}