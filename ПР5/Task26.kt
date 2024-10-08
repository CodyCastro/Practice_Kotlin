fun main() {
    print("Введите число:")
    val n = readln().toInt()

    var sum1 = 0
    var sum2 = 0

    for(i in 1..n){
        if (i % 2 == 0) sum2 += i
        else sum1 += i
    }

    println("Сумма четных чисел от 1 до $n = $sum2")
    println("Сумма нечетных чисел от 1 до $n = $sum1")
}