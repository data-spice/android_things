fun main() {
    val name = "John Doe"
    val age = 22
    val course = "Mechatronics Engineering"
    val isRegistered = true

    val sub1: Double = 78.0
    val sub2: Double = 23.0
    val sub3: Double = 99.0

    val avg: Double = (sub1 + sub2 + sub3) / 3

    var grade = 'N'

    if (isRegistered && (avg > 49)) {
        grade = when {
            avg > 80 -> 'A'
            avg > 70 -> 'B'
            avg > 60 -> 'C'
            avg > 50 -> 'D'
            else -> 'F'
        }
    } else {
        println("An error occurred.\nPlease check if the student is registered and whether the average score is greater than 50")
    }

    //Report printing
    println(
        """
        ==============================================
                        STUDENT REPORT
        ==============================================
            Student Name: ${name} 
            Age: ${age} 
            Course: ${course}
            Grade: ${grade}
        ==============================================
            """.trimIndent()
    )
}