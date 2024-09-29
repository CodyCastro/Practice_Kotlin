fun main() {
    val arr1 = intArrayOf(1,2,3,4,5)
    val arr2 = intArrayOf(11,22,33,44,55)
    val arr3 = intArrayOf(111,222,333,444)

    fun combiningArrays(array1: IntArray, array2: IntArray, array3: IntArray){
        println((array1 + array2 + array3).joinToString())
    }

    combiningArrays(arr1,arr2,arr3)
}