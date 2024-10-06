fun main(){

    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun copyArray(array1: IntArray){
        val array2 = array1.copyOf()

        println("Скопированный массив: ${array2.joinToString()}")
    }

    copyArray(arr)
}