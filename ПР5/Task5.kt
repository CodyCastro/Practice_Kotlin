fun main(){

    print("Введите число: ")
    val num = readln().toInt()

    var count = 0

    for (i in 1..num) {
        if (num % i == 0) {
            count++
        }
    }

    if (count == 2) {
        println("$num - простое число")
    }
    else{
        println("$num - не простое число")
    }
}