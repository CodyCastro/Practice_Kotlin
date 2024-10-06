fun main(){
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun findElement(index: Int, array: IntArray){
        println(array[index])
    }
    
    findElement(5, arr)
}