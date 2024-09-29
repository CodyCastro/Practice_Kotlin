fun main() {
    val arr = arrayOfNulls<Int>(5)

    for(i in 0..4){
        print("элемент $i: ")
        arr[i] = readln().toInt()
    }

    println("\n" + arr.joinToString())
}