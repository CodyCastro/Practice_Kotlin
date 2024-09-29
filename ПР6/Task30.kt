fun main() {
    val arr = Array<Int>(100, {(1..100).random()})
    var group = 1
    val size = arr.size

    var j = 0
    var k = 9
    for(i in 0..9){
        println("Группа $group:")
        for(i in j..k){
            print("${arr[i]} ")
        }
        j += 9
        k += 9
        group++
        print("\n")
    }

}