/*
    -- Kotlin uses parentheses () after declaring the class to define its primary constructor then curly braces to define the rest.
    -- Note that kotlin does not accept one to set the setter methods in the primary constructor.
    -- Note in the constructor if you write something like firstName: String , without a val or a var you have just declared a parameter only.
       that is not a changeable variable and cannot be accessed ie println(student1.firstname) --> Error.
       In order to use it as an accessible variable initialize it with var or val i.e. val firstName: String
        then println(student1.firstName) --> works
    -- You cannot use var or val on a variable twice in the constructor body and in the class body

 */

class Student(
    var firstName: String,
    var midName: String? = null,
    var lastName: String,
    var age: Int,
     marks: Double
){
    var marks: Double = marks
        set(value){
            // Incase the marks are changed
            require(value in 0.0..100.0){
                "Marks must be in the range of 0 to 100"
            }
            field=value
            grade=calculateGrade(value)
        }
    var grade: Char= calculateGrade(marks)
        private set
    /*
       -- Normally when the setter is not declared as a private property the value of grade can be altered by code that is outside the class.
          i.e.     student1.grade='A'
          But when the private set is used the setter becomes restricted to code within the class
          Therefore
            student1.grade='A' --> Error

     */

    private fun calculateGrade(marks: Double): Char{
        return when{
                marks >=80.00 -> 'A'
                marks>=70.00 ->'B'
                marks>=60.00 -> 'C'
                marks>=50.00 -> 'D'
                else -> 'E'
            }

        }

    override fun toString(): String{
        return  "=========================================\n"+
                "Student Name: $firstName $midName $lastName\n" +
                "Student Age: $age\n"+
                "Student Marks: $marks\n"+
                "Student Grade: $grade\n"+
                "=========================================\n"

    }

    /*
    --- WHAT IS AN INIT BLOCK ---
          init{
                Code that runs when an object is created
              }
        --The code in the init block runs when an object is created from the class, helping you to check if the data is valid.
        --NOTE: the init block runs only once when the object is created. When the values are later changed after the object is created it will NOT RUN AGAIN.

    --- WHAT IS THE REQUIRED BLOCK ---
           require(condition){
                "The error message that appears (string)"
           }

     */


    init {
        require(marks in 0.0..100.0){
            "Marks must be between 0 and 100"
        }

        require(age>=0){
            "Age cannot be negative"
        }
    }



}


fun main(){

    var student1 = Student("Victor","Mwaniki","Karimi",23,98.76)
    var student2= Student("Arnold","Kamau","Njoroge",32,78.65)
//    print(student1.toString())
//    print(student2.toString())

    val marks = mutableListOf<Double>(45.00,88.98,67.0,54.0)

    //Removes a specific element
    marks.remove(45.00)

    //Removes at a specific index
    marks.removeAt(2)

    println(marks)


    //Question 5

    for ( i in 1..10){
        println(i)
    }
    println("===============================")

    for (i in 20 downTo 2 step 2){
        println(i)
    }


    //Question 6

    var studentDetails= Pair("Victor",23)
    val (name,age)=studentDetails
    println("$name $age")
    println("===========================")
    println()

    //Question 4
    val studentNames= arrayOf("Victor","Mwaniki","Dennis","Wariuki","James")
    for ((index,name) in studentNames.withIndex()){
        println("Position: $index  Name: $name")
    }

    //Question 7
    fun avg(){
        var total=0.0
        for (i in marks){
            total+=i
        }

        val average= total/marks.size
        println("=========================")
        println("Average marks: ${"%.2f".format(average)}")

    }

    avg()
}