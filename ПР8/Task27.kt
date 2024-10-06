fun main(){
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun isInArr(el: Int, array: IntArray){
        if(el in array){
            println("Элемент $el есть в массиве")
        }
        else{
            println("Элемент $el отсутствует в массиве")
        }
    }

    isInArr(11, arr)
}