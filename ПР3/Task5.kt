fun main() {
    print("Введите сторону a: ")
    val a = readln().toInt()
    print("Введите сторону b: ")
    val b = readln().toInt()
    print("Введите сторону c: ")
    val c = readln().toInt()
    val sum = a + b + c

    if (a <= b + c && b <= a + c && c <= a + b) {
        println("Треугольник существует")
    }
    else{
        println("Треугольник не существует, т.к. одна из его сторон превышает сумму двух других.")
    }
}