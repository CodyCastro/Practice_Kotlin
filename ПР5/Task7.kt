fun main() {
    print("Введите число: ")
    var n = readln().toInt()
    n -= 2

    println("1\n1")

    var num1 = 1
    var num2 = 1
    var t = 1

    for(i in 1..n) {
        t = num1 + num2
        num1 = num2
        num2 = t

        println(t)
    }
}




