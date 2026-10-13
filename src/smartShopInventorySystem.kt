





fun main() {

    //Part 1
    val productName: MutableList<String?> = mutableListOf("Bread", "BMW", "Butter", "Microwave", "Corn", null)
    val productPrice: List<Double> = mutableListOf(65.00, 1700000.56, 300.76, 9000.99, 76.99, 66.00)


    //Part 2

    fun productTotal() {
        var total = 0.0
        for (price in productPrice) {
            total += price
        }
        println("======================================")
        println(
            " Product total: $total\n" +
                    "======================================"
        )
    }


    fun expensiveProduct() {
        var mostExpensive = 0.0
        var indexItem = 0
        for (index in productPrice.indices) {
            if (productPrice[index] > mostExpensive) {
                mostExpensive = productPrice[index]
                indexItem = index
            }
        }
        println("======================================")
        println("Most Expensive Product: ${productName[indexItem]}  Price: ${productPrice[indexItem]}")
        println("=======================================")
    }

    fun productExists(prod: String) {

        var found = false
        for (item in productName.indices) {
            if (productName[item] == prod) {
                found = true
                println("======================================")
                println("Product $prod exists at index $item")
                println("======================================")
                break
            }
        }
        if (found == false) {
            println("======================================")
            println("Product $prod does not exist")
            println("======================================")
        }
    }


    productTotal()
    expensiveProduct()
    productExists("Soap2")

    //Part 3

    fun calculatePrice(priceOfProduct: Double, otherParameter: Double, operation: (Double, Double) -> Double) {
        var result = operation(priceOfProduct, otherParameter)
        println("======================================")
        println("Final product price: ${"%.2f".format(result)}")
        println("======================================")
    }

    fun deliveryPrice(price: Double, delFee: Double): Double {
        return (price + delFee)
    }

    fun discountPrice(price: Double, discountPercentage: Double): Double {
        var finalTotal = price - (price * discountPercentage)
        return finalTotal
    }

    //  Part 4

    calculatePrice(2400.00, 0.25, ::discountPrice)
    calculatePrice(1300.00, 300.89, ::deliveryPrice)

    calculatePrice(120000.45, 4500.00) { x, y -> x + y }


    //Part 5

    /*
      -- it is a shorthand name for the current element being processed in a lambda function
         it can be used in a lamba function that has exactly one parameter
     */
    var aboveFive = productPrice.filter { it > 5000 } //can be re-written as {item -> item >5000}


    println("======================================")
    println(aboveFive)
    println("======================================")

    println("======================================")
    productName.indices.forEach { it ->
        println("ProductName: ${productName[it]}   ProductPrice: ${productPrice[it]}")
    }
    println("======================================")


    val newPrices = productPrice.map { price -> price + 500 }



    println("======================================")
    newPrices.indices.forEach { it ->
        println("ProductName: ${productName[it]}   NEW_ProductPrice: ${newPrices[it]}")
    }
    println("======================================")


    // Part 6
    println("======================================")
    println("             PRODUCT LIST             ")
    println("======================================")
    val displayName =productName.map{
        it -> it ?: "Unknown product"
    }
    displayName.forEach{
        name -> println(name)
    }
    println("======================================")


    /*
                -- THE SAFE OPERATOR --
      --
     */

}



