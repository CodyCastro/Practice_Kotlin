fun main() {
    val arr = arrayOf(1,5,3,4,5)
    println(arr.joinToString())
    var maxSequence = 0
    var temp = 0
    val size = arr.size

    for(i in 0..size-1){
        for(j in 0..size-1){
            if(arr.indexOf(j) != arr.indexOf(i)){
                if(arr[j] == arr[i]){
                    println("${arr[j]} = ${arr[i]}")
                    maxSequence++
                }
            }
        }
    }

    println("Максимальная последовательность: $maxSequence")
}