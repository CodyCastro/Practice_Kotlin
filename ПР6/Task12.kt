fun main() {
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println(arr.joinToString())

    // Меняет два элемента местами по индексам
    fun swap(i: Int, j:Int){
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }

    swap(0,4) // 1 и 5

    println(arr.joinToString())
}