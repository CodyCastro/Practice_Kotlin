fun main(){
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun lastElement(array: IntArray){
        println("Последний элемент в массиве: ${array[array.size-1]}")
    }

    lastElement(arr)
}