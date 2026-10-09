fun main(){
    // Purchase definition
    val productName="Sprite"
    val unitPrice=20.87
    val quantity=6.0
    val membership= true

    val subTotal: Double = unitPrice*quantity

    val discount: Double = when{
        subTotal < 1000 -> 0.0
        subTotal < 4999.99 -> 0.05
        else -> 0.1
    }

    val discountAmount=subTotal*discount

    val finalTotal= subTotal-discountAmount

    var freeDelivery= false
    var promotionalOffer= false

    if (finalTotal>=2000) {
        freeDelivery = true
    }

    if (membership && finalTotal>=3000){
        promotionalOffer= true
    }

    var delivery="Not qualified "
    if (freeDelivery){
        delivery="Free delivery"
    }




    println("""
        ==========================================
                        RECEIPT
        ==========================================
        Product Name: ${productName}
        Product Quantity: ${quantity}

        ------------------
   
        Delivery Status: ${delivery}
        Promotional Eligibility:${promotionalOffer}
        
        -----------------------------------
        Subtotal: %.2f
        Discount amount: ${discountAmount}
        Discount Percentage: ${discount * 100}
        Final Total: ${finalTotal}
        
        ==========================================
        
        
    """.trimIndent().format(subTotal))
}