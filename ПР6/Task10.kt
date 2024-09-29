fun main() {
    val arr = mutableListOf(11,24,36,74,58,63,71,18,49,510)
    var sum = 0
    println(arr.joinToString())

    for(i in arr){
        if(i % 2 == 0){
            sum += i
        }
        else{
            continue
        }
    }

    println("Сумма чётных элементов в массиве: $sum")

}