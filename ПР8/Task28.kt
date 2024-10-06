fun main(){

    fun createArray(n: Int){
        val arr = arrayOfNulls<Int>(n)

        for(i in 1..n) {
            arr[i - 1] = i
        }

        println(arr.joinToString())
    }

    createArray(15)
}