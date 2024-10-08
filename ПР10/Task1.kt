fun main() {
    // возвращает список, представляющий все числа от n до 1.
    // Если n значение равно нулю, то будет возвращен пустой список.

    fun printList(n: Int){
        val arr = arrayOfNulls<Int>(n)

        for(i in 0..n-1){
            arr[i] = i+1
        }

        println("[" + arr.joinToString() + "]")
    }

    printList(10)
}