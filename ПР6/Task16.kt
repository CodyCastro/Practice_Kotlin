fun main() {
    var arr1 = arrayOf(1,2,3,4,5)
    val arr2 = arrayOf(6,7,8,9,10)

    arr1 += arr2

    println(arr1.joinToString())
}