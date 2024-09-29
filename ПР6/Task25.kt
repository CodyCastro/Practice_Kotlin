fun main() {
    val arr = arrayOf(1,2,3,4,5)
    println(arr.joinToString())
    val isNumHere: Boolean

    print("Введите элемент массива для поиска: ")
    val input = readln().toInt()

    if(input in arr){
        isNumHere = true
    }
    else{
        isNumHere = false
    }

    println(isNumHere)
}