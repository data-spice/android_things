fun calculate2(
    a:Int,
    b:Int,
    operation:(Int,Int) -> Int){
    var result= operation(a,b)
    println(result)

}


fun add2(a: Int, b: Int): Int{
    return a+b
}


fun sub2(a: Int,b: Int): Int{
    return a-b
}



fun main() {
    calculate2(20, 4, ::add2)
    calculate2(20, 14, ::sub2)
}