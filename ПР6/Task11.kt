fun main() {
    val arr1 = mutableListOf(1,2,3,4,5,6,7,8,10)
    println(arr1.joinToString())
    val arr2 = mutableListOf(0,2,3,4,8,10,11,12,13)
    println(arr2.joinToString())

    println("Пересечения массивов: " + arr1.intersect(arr2))
}