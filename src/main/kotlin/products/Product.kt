package products

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Product(
    @SerialName("id") val id: Int,
    @SerialName("product_name") val name: String,
    @SerialName("category") val category: ProductCategory,
    @SerialName("product_price") val price: Double,
    @SerialName("product_description") val description: String,
    @SerialName("product_brand") val brand: String,
    @SerialName("product_weight") val weight: Double,
    @SerialName("product_stock") val stock: Int
)