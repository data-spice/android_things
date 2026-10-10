fun main(){

    //part 1
    val name ="Victor"
    val age=23
    val course= "Android development"
    val isRegistered= true
    var marks= arrayOf(89,88,98,98,99)

    //part 2
    println(marks.first())
    println(marks.last())
    println("Number of marks: ${marks.size}")
    marks[2]=99
    println(marks[2])

    //part 3
    val avg: Double =marks.average()

    var isFifty=false
    if (avg>=50){
        isFifty=true
    }
    var academicStatus=""
    if (isFifty){
        academicStatus="Average more than 50 proceed"
    }else{
        academicStatus="Average less than 50 proceed"
    }

    var qualified=false
    if(isRegistered && avg>=50){
        qualified=true
    }

    var status=""
    if (qualified){
        status="Good"
    }else{
        status="Bad"
    }

    //part D
    var grade= when{
        avg>=80 -> 'A'
        avg>=70 -> 'B'
        avg>=60 -> 'C'
        avg>=50 -> 'D'
        else -> 'F'

    }

    println("""
        =========================================
                     STUDENT REPORT
        =========================================
        Student Name: $name
        Student Age: $age
        Course: $course
        Registration status: $status
        
        -----------------------------------------
        Average Grade: $avg
        Grade: $grade
        Marks: ${marks.contentToString()}
        
        -----------------------------------------
        Comments: $academicStatus
        =========================================
    """.trimIndent())

}