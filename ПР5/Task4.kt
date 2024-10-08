fun main(){
    print("Введите число: ")
    val num = readln().toInt()

    var factorial = 1

    for(i in 1..num){
        factorial *= i
    }

    println("Факториал числа $num = $factorial")
}