fun main(){
    /*
    range using ..
    The .. operator creates a range of values from a starting number to an ending number.Both ends are included ie
    1..5 includes numbers 1,2,3,4,5
     */

    for (i in 1..5){
//        println(i)
        continue
    }


    /*
    until creates a range that excludes the end number
    ie .
    until 5 includes the numbers 1,2,3,4
     */
    for (i in 1 until 5){
//        println(i)
        continue
    }


    /*
    downTo counts the numbers in a downward manner from large to small
    ie .
     5 downTo 1 includes the numbers 5,4,3,2,1
     */
    for ( i in 5 downTo 1){
//        println(i)
        continue
    }


    /*
    step -- controls the jump distance from one number to another
    ie
    1..10 step 2 includes the numbers 1,3,5,7,9
     */

    for (i in 1..10 step 2){
//        println(i)
        continue
    }





}