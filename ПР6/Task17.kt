fun main() {
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var sum = 0
    var product = 1
    println(arr.joinToString())

    for(i in arr){
        sum += i
        product *= i
    }

    println("Сумма элементов массива: $sum\n" +
            "Произведение элементов массива: $product")
}