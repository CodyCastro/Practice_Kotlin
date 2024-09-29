fun main() {
    val arr = mutableListOf(11,24,36,74,58,63,71,18,49,510)
    println("[" + arr.joinToString() + "]" + "\n")
    var arr1 = mutableListOf<Int>() // Массив чётных чисел
    var arr2 = mutableListOf<Int>() // Массив нечётных чисел

    for(i in arr){
        if(i % 2 == 0){
            arr1.add(i)
        }
        else{
            arr2.add(i)
        }
    }

    println("Массив чётных чисел: " + arr1.joinToString())
    println("Массив нечётных чисел: " + arr2.joinToString())
}