fun main(){
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun arrayMaxNum(array: IntArray){
        var max = array[0]
        
        for(i in array){
            if (i > max){
                max = i
            }
        }

        println("Максимальное число в массиве: $max")
    }

    arrayMaxNum(arr)

}