package products

object FoodFilterCategory: Condition {
    override fun isSuitable(product: Product): Boolean {
        return product.category == ProductCategory.FOOD
    }
}