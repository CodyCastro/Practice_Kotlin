fun main() {
    val arr = arrayOfNulls<Int>(20)

    for((i) in arr.withIndex()){
        arr[i] = (1..100).random()
    }

    println("[" + arr.joinToString() + "]")

    for(i in arr){
        if(i!! % 3 == 0){
            print("$i ")
        }
    }
}