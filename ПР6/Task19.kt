fun main() {
    val arr1 = arrayOf(5,2,3,1,4)
    val arr2 = arrayOf(8,6,7,9,11,10)
    println(arr1.joinToString())
    println(arr2.joinToString())

    fun bubbleSort(arr: Array<Int>) {
        val n = arr.size

        for (i in 0..<n - 1) {
            for (j in 0..<n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }

    bubbleSort(arr1)
    bubbleSort(arr2)

    println("\n"+(arr1 + arr2).joinToString())

}