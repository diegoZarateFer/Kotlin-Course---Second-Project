package products

object PriceFilter : Condition {
    override fun isSuitable(product: Product): Boolean {
        return product.price > 500
    }
}