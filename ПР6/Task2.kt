fun main() {
    val arr = arrayOf(1,2,3,4,5)
    var sum = 0

    var j = 0
    for(i in arr){
        sum += arr[j]
        j++
    }

    print(sum)
}