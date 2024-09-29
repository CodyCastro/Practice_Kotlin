fun main() {
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25)
    println(arr.joinToString()+"\n")
    var group = 1

    var j = 0
    var k = 4
    for(i in 0..5){
        println("Группа $group:")
        for(i in j..k){
            print("${arr[i]} ")
        }
        j += 4
        k += 4
        group++
        print("\n")
    }
}