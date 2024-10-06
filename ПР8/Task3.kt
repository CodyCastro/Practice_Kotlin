fun main() {
    val array1 = intArrayOf(1,2,3,4,5)
    val array2 = intArrayOf(6,7,8,9,10)

    fun combiningNumbers(arr1: IntArray, arr2: IntArray){
        println("Объединение: ${(arr1 + arr2).joinToString()}")
    }

    combiningNumbers(array1, array2)
}