fun main(){
    val word ="victor"

    val shopping = listOf("Sugar", "Tea", "Bread", "Milk")


    for (letter in word.indices){
//        println(letter)
        continue
    }



    for (letter in word){
//        println(letter)
        continue
    }



    for ((index,character) in word.withIndex()){
//        println("$index -> $character")
        continue
    }



//    word.forEach{
//        character -> println(character)
//    }


    shopping.forEach{
        item -> println("Buy $item")
    }


    val buy = shopping.map{
        item -> "We have $item"
    }


    println()
    println(buy)
}