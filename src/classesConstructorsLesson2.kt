/*
-- CLASSES AND METHODS --

In classes, we have properties(variable) and behaviors(functions)
Use getters and setters to implement some good logic
some functions like recording, on or off etc. are what are referred to as functions


-- CONSTRUCTORS --

In the code below every time you need to create a TV or a phone you need to assign the values i.e.
    tv.brand="Samsung"
A constructor lets you put the values immediately i.e.
    val tv=SmartDevice("Samsung",1000.00)

-- : , :: and -> operators --

    : specifies a type or establishes an inheritance/implementation.

    :: references an existing function,property or constructor.

    -> (1). Used in lambda functions(a function that you can write without giving it a name) i.e. val add = { a: Int, b: Int -> a + b }
       (2). In specifying the function types i.e. (Int, Int) -> Int ...the -> Int means the function returns an Int
       (3). Separating the lambda parameters from the code that it executes.
            i.e.
            fun main() {
                    calculate(2, 3) { a, b -> a + b }

              Output: 5

       (4). When specifying what should happen in a particular condition in a when expression.
               i.e.
               val result = when (day) {
                                 1 -> "Monday"
                                 2 -> "Tuesday"
                                 else -> "Unknown day"
                               }

}



 */

class SmartDevice2 (
    var brand: String?,
    var price: Double?

){

    /*
    --  MULTIPLE CONSTRUCTORS --
    -> They provide alternative ways to initialize an object.Suppose you want to initialize a phone but the price has not yet been said yet.

    this() calls the parent/primary constructor and now can feed values into it using the secondary constructor
    your secondary constructor should not have the same signature as the primary constructor as it would cause a delegation cycle-- where a constructor would end up calling itself.
     */

    constructor() : this(null,null)
    constructor(
        brand: String): this(brand,0.0) //A constructor that accepts one argument, a brand

    //methods(Behaviors)
    fun turnOn(){
        println("$brand is switching on")
    }

    fun turnOff(){
        println("$brand is off")
    }
// Now you can print the object using this string
    override fun toString(): String {
        return "SmartDevice2(brand=$brand, price=$price)"
    }
//Checks on equality
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice2

        if (price != other.price) return false
        if (brand != other.brand) return false

        return true
    }

    override fun hashCode(): Int {
        var result = price.hashCode()
        result = 31 * result + brand.hashCode()
        return result
    }


}

fun main(){

    val tv=SmartDevice2("Samsung") //Phone without price has been initialized.
    val tv2=SmartDevice2("Samsung")
    println("${tv.brand} ${tv.price}")

    val phone=SmartDevice2("Apple Iphone",1200.67)

    println("${phone.brand} ${phone.price}")

    phone.turnOn()
    phone.turnOff()

    val laptop=SmartDevice2()

    println("${laptop.brand} ${laptop.price}")

    println(laptop.toString())

    /*
    -- EQUALITY --
    In classes if you run println(tv == tv1) even if they are the same it will mostly output false since it will be checking if they refer to the same memory location.\
    You can override this behavior in the class methods by right-clicking -> Generate and using your head to generate the appropriate method.
    Note: == checks if value is the same
          === checks if they refer to the same memory location
     */

    println(tv ==  tv2)
    println(tv === tv2)



}