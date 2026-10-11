fun main() {
    /*
    Break -- immediately terminates the nearest enclosing loop
    */

    for (i in 1..20) {
//        println(i)
//        if (i==5){
//            println("Loop broken at $i")
//            break
//
//        }
    }


    /*
    Continue -- skips the rest of the current iteration and moves on to the next iteration.
    It does not terminate the entire loop.
     */

    for (i in 20 downTo 0) {
        if (i == 3) {
            println("Loop is skipping value 3. Proceeding")
            continue
        }

        println(i)
    }


    val marks = listOf(75, -5, 82, 110, 60)

    // Combining ranges and some for statements


    for (mark in marks) {
        if (mark !in 0..100) {
            continue
        }

        println("Valid mark: $mark")

    }
}


