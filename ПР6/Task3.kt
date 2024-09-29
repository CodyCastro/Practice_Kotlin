fun main() {
    val arr = arrayOf(12,2,33,4,56,6,7,1,29,10)
    println(arr.joinToString())
    var max = arr[0]
    var min = arr[0]

    for(i in arr){
        if(i > max){
            max = i
        }
    }

    for(i in arr){
        if(i < min){
            min = i
        }
    }

    println("Максимальное число: $max")
    println("Минимальное число: $min")

}