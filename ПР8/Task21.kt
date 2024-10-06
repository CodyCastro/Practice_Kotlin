fun bubbleSort(arr: IntArray) {
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

fun main() {
    val arr = intArrayOf(12,2,33,4,56,6,7,1,29,10)
    println(arr.joinToString())

    bubbleSort(arr)

    println(arr.joinToString())
}