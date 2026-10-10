fun main(){

    //part 1
    var name = "Mkathos"
    var age = 45
    var membershipStatus=true
    val products = arrayOf("Soap","Tissue","Nduma")
    val prices=doubleArrayOf(800.67,300.87,80.54)
    val quantity =arrayOf(6,10,4)

    //part 2
    var subTotal=0.0
    for (i in 0..2){
        subTotal+=(prices[i]*quantity[i])
    }
    println(subTotal)

    var discount =when{
        subTotal>=1000 -> 0.0
        subTotal>=5000 ->0.05
        subTotal>5000 ->0.10
        else -> 0.0
    }

    if (membershipStatus && subTotal>=5000){
        discount+=0.05
    }

    val discountAmount= subTotal*discount

    val finalTotal=subTotal-discountAmount

    //part c

    val freeDelivery= when {
        finalTotal>=2000 -> true
        else -> false
    }

    val promotionalOffer=when {
        membershipStatus && finalTotal>= 2000 -> "Qualified"
        else -> "Not Qualified"
    }

    val discountQualified=when{
        discount>0.0 -> "Qualified"
        else -> "Not Qualified"
    }



    val purchaseSize= when{
        subTotal<=2000 -> "Small"
        subTotal<=8000 -> "Medium"
        else -> "Large"
    }

    var deliveryMessage=""

    if (freeDelivery){
        deliveryMessage="Free Delivery"
    }else{
        deliveryMessage="Delivery charges apply"
    }

    println("""
    ====================================
                 RECEIPT
    ====================================
    Customer Name: $name
    Customer Age: $age
    Membership: ${if (membershipStatus) "Yes" else "No"}

    ------------------------------------
    PRODUCT DETAILS
    ------------------------------------
    Product          Price      Qty      Total
    ------------------------------------
""".trimIndent())

    for (i in products.indices) {
        val productTotal = prices[i] * quantity[i]

        println(
            "${products[i].padEnd(17)}" +
                    "${"%.2f".format(prices[i]).padStart(8)}" +
                    "${quantity[i].toString().padStart(8)}" +
                    "${"%.2f".format(productTotal).padStart(12)}"
        )
    }

    println("""
    ------------------------------------
    Subtotal:           ${"%.2f".format(subTotal)}
    Discount:           ${"%.2f".format(discount * 100)}%
    Discount Amount:    ${"%.2f".format(discountAmount)}
    Final Total:        ${"%.2f".format(finalTotal)}

    Free Delivery:      $deliveryMessage
    Promotional Offer:  $promotionalOffer
    Discount Qualified: $discountQualified
    Purchase Size:      $purchaseSize
    ====================================
              THANK YOU!
    ====================================
""".trimIndent())


}