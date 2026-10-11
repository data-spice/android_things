/* A  data class is a special type of class that is used to store related information about one object.
   For example, you can use a data class to represent a student, employee, product, customer or bank account.
 */

// starships were ment to fly


data class Student(
    val name: String,
    val age: Int,
    val course: String
)



fun main(){

    val student1=Student("Victor",34,"Android Development and AI")
    val student2=Student("Mwaniki",34,"Information Technology")

    println(student1)
    println(student2)

    println(student1.name)
    println(student2.name)
    println(student1.age)
    println(student2.age)
    println(student1.course)
    println(student2.course)


}