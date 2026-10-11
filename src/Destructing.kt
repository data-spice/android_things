fun main() {
    //Destructing means taking the values stored inside an object or data structure and assigning them to seperate variables in one statement
    val student = Pair("Victor",20)
    val (name,age)=student
    println(student)
    println(name)
    println(age)

    //Destructing using to

    val product= "Soap" to 10
    val item= product.first
    val price=product.second

    //Destructing a triple

    val goods=Triple("Sugar",120,3)
    val (goodName,cost,quantity)=goods

    // Ignoring a value that you do not need. Use an underscore in the specific field _

    val model= Triple("Toyota","ZX",2026)
    val (carName,_,year)=model

    // some other applications

    val shopping= listOf(
        "Sugar" to 204,
        "Bread" to 65,
        "Milk" to 60
    )

    for ((itemInBag,itemPrice) in shopping){
        println("$itemInBag costs KSH: $itemPrice.")
    }
}