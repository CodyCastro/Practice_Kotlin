fun main(){

    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun arrayMaxMin(array: IntArray){
        var max = array[0]
        var min = array[0]

        for(i in array){
            if(i > max){
                max = i
            }
        }

        for(i in array){
            if(i < min){
                min = i
            }
        }

        println("Максимальное число: $max")
        println("Минимальное число: $min")
    }

    arrayMaxMin(arr)
}