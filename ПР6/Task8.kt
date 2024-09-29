fun main() {
    val arr = mutableListOf(11,24,36,74,58,63,71,18,49,510)

    println("[" + arr.joinToString() + "]" + "\n")

    print("Введите элемент массива для поиска: ")
    val input = readln().toInt()

    if(input in arr){
        for(i in arr){
            when(input){
                i -> println("Индекс: " + arr.indexOf(i))
            }
        }
    }
    else{
        println("Ошибка: введённого элемента нет в массиве")
    }


}