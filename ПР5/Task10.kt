fun main(){

    print("Введите число: ")
    val num = readln()
    val l = num.length

    var number = num.toInt()
    var sum = 0

    for (i in 0..l) {
        sum += number % 10
        number /= 10
    }

    println("Сумма цифр числа $num: $sum")
}