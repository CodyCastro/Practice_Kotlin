fun main() {
    val arr = arrayOf(4,4,4,4)
    //val arr2 = arr1.reverse()
    println(arr.joinToString())
    val size:Int = arr.size

    var sum1 = 0
    var sum2 = 0

    for (i in 0 .. size / 2) {
        if (arr[i] != arr[size - i - 1]) {
            println("Массив не является палиндромом")
        }
        else{
            println("Массив является палиндромом")
            break
        }
    }
}