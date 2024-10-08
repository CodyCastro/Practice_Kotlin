fun main() {

    print("Введите число: ")
    val num = readln().toInt()

    var a = num
    var b = ""

    while(a > 0) {
        b += (a % 2).toString()
        a /= 2
    }

    println("Число $num в двоичной системе: $b")
}