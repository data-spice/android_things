fun main(){
//    greet("Victor",14)
//    greet("shantel",7)
//
//    car()
//    car("Mercedes")

    foo(bar = {
        println("Bar as a function")
    })

    calculate(2,3,  ::add)

}

/*
    Note all functions are public that is are visible in all files.
    Unless the function is declared private using the private keyword.
 */


// Unit is the same as the void type in java.



fun greet(name:String, age: Int) {
    println("Hello $name")
    if (age > 10) {
        println("You are ready to vote")
    } else {
        println("You cannot vote")
    }
}


//Default Arguments

fun car(model: String="Toyota") {
    println("You drive a $model")
}

/*
Functions as Arguments (higher order functions).
They are useful when you want one function to perform a general task but allow the caller function to decide what should happen
 */

fun foo (bar: () -> Unit){
    println("Bar function")
    bar()
}

private fun calculate(
    a:Int,
    b:Int,
    operation:(Int,Int) ->Int
){
    val result = operation(a,b)
    println(result)
}


fun add(a:Int,b:Int): Int{
    return (a+b)
}

/*
Note: For Single Expression Functions the function body can be expressed after = sign after omitting the {}
 */

fun double(n:Int): Int=n*2