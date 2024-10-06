fun main(){
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun reverseArray(array: IntArray){
        val res = array.reversed()
        println("Перевёрнутый массив: ${res.joinToString()}")
    }
    
    reverseArray(arr)
}