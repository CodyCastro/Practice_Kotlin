fun main(){
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    fun arraySum(array: IntArray){
        var sum = 0

        for(i in array){
            sum += i
        }

        println("Сумма: $sum")
    }

    arraySum(arr)
}