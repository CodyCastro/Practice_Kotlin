fun main() {
    val arr = arrayOf(11,2,6,4,5)
    println(arr.joinToString())
    var max = arr[0]

    for(i in arr){
        if(i > max){
            max = i
        }
    }

    var max2 = 0

    for(i in arr){
        if(i == max){
            continue
        }

        if(i > max2){
            max2 = i
        }
    }

    println("Максимальное: $max")
    println("Максимальное второе: $max2")
}