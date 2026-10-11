fun main (){
    // This is an immutable list - read only
    val products= listOf("Books","Pens","Crayons")
    println(products)
    println(products[0])
    println(products.size)
    println(products.first())
    println(products.contains("Books"))

    // You can also specify the type

    val marks: List<Int> =listOf(1,2,3,4,5)

    // Creating a mutable list -- Can be modified

    val shopping = mutableListOf("Soap","Sugar")

    shopping.add("Tea")
    shopping.removeAll(listOf("Sugar","Tea"))
    println(shopping)

}