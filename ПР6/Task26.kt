fun main() {
    val arr = arrayOf(1,2,3,4,5)
    println(arr.joinToString())
    var sum = 0
    val size = arr.size

    for(i in arr){
        sum += i
    }

    val arithmeticAverage = sum/size

    println(arithmeticAverage)

}