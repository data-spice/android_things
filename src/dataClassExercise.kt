data class Book(
    var title: String,
    var author: String,
    var year: Int
)


fun main(){
    val employeeRecord= Triple("Amina","IT",800000)

    val shoppingList= mutableListOf(
        "Sugar" to 200,
        "Flour" to 263,
        "Toyota Zx Sports Edition" to 2300000
    )

    for( (item,price) in shoppingList){
        println("$item costs $price")
    }

    val book1=Book("Dawn of a new Era","Victor Mwaniki",2031)


    val (bookName,_,year)=book1
    print("Book name: $bookName\nYear published: $year")


}