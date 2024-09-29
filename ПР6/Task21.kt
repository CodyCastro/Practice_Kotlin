fun main() {
    val arr = mutableListOf(1,2,3,4,5)
    println(arr.joinToString())

    fun delEl(element: Int){
        arr.removeAt(element)
    }

    delEl(2)
    println(arr.joinToString())
}