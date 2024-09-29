fun main() {
    val arr = arrayOf(1,2,3,4,5)
    println(arr.joinToString())

    fun arrMedian(arr: Array<Int>): Double {
        val sortedArray = arr.sortedArray()
        val size = sortedArray.size
        return if (size % 2 == 0){
            (sortedArray[size / 2 - 1] + sortedArray[size / 2]) / 2.0
        }
        else{
            sortedArray[size / 2].toDouble()
        }
    }

    val median = arrMedian(arr)
    println(median)
}