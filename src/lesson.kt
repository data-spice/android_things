fun main(){
    //This is a comment
    /* This is a multiline comment
    line 2
     */

    var age =50
    val name= "Victor"

    println("My name is $name.")
    println("My age is $age")

    /* if (condition) {
            body
            }

       if (condition) {
           body
        }else{
            body
            }

        if (condition) {
            body
        } else if (condition){
            body
        }else{
            body
            }

     */

    val avg = 60

    val grade = when {
        avg>=70 -> 'A'
        avg>=60 -> 'B'
        avg>=50 -> 'C'
        avg>=40 -> 'D'
        else -> 'F'
    }


    println("""
        ===========================
              STUDENT REPORT
        ===========================
        Student Name: $name
        Student Average: $avg
        
        Final Grade: $grade
        ===========================
       
    """.trimIndent())


}