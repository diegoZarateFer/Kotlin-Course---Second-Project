package products

import kotlinx.serialization.json.Json
import java.io.File

object ProductsRepository {
    private val file = File("products.json")

    private val _products = loadProducts()
    val products: List<Product>
        get() = _products

    private fun loadProducts(): List<Product> {
        val serializedProducts = file.readText().trim()
        return Json.decodeFromString<List<Product>>(serializedProducts);
    }
}