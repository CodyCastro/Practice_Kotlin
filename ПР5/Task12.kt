fun main() {
    print("Введите число: ")
    val n = readln().toInt()

    print("Введите шаг: ")
    val step = readln().toInt()

    print("Числовая последовательность: ")

    for (i in 0..20 step step)
    {
        print("$i ")
    }
}