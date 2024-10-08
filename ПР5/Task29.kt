fun main() {

    print("Введите n: ")
    val n = readln().toInt()

    var sum = 0.0f

    for (i in 1..n) {
        sum += 1.0f/i
    }

    println("Сумма ряда: $sum")
}