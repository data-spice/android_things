/*
-- CLASSES AND METHODS --

In classes we have properties(variable) and behaviors(functions)
Use getters and setters to implement some good logic
some functions like recording, on or off etc. are what are referred to as functions


-- CONSTRUCTORS --

In the code below every time you need to create a TV or a phone you need to assign the values i.e.
    tv.brand="Samsung"
A constructor lets you put the values immediately i.e.
    val tv=SmartDevice("Samsung",1000.00)


 */

class SmartDevice (
    var brand: String?=null,
    var price: Double?

){
    //var brand: String = brand
        // Default getter method
        //get()= field
        //Custom getter method
        //get()="foo"

        //Default setter
        //set(value){
        //      field=value
        //  }
        //CUSTOM SETTER
//        set(value){
//            field=value.uppercase()
//        }

    //methods(Behaviors)
    fun turnOn(){
        println("$brand is switching on")
    }

    fun turnOff(){
        println("$brand is off")
    }


}

fun main(){

    val tv=SmartDevice("Samsung",1000.00)

    println("${tv.brand} ${tv.price}")

    val phone=SmartDevice("Apple Iphone",1200.67)

    println("${phone.brand} ${phone.price}")

    phone.turnOn()
    phone.turnOff()



}