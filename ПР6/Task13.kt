fun main() {
    val arr = arrayOfNulls<Int>(20)

    for((i) in arr.withIndex()){
        arr[i] = (1..100).random()
    }

    print(arr.joinToString())
}