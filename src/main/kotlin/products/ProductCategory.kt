package products

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ProductCategory {
    @SerialName("electronics")
    ELECTRONICS,

    @SerialName("home")
    HOME,

    @SerialName("food")
    FOOD,

}