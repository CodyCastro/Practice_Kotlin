fun main() {

    print("Введите год: ")
    val year = readln().toInt()

    print("Введите месяц: ")
    val month = readln().toInt()

    val leap: Boolean = when {
        year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) -> true
        else -> false
    }

    val days = when(month) {
        4, 6, 9, 11 -> 30
        2 -> when {
            leap -> 29
            else -> 28
        }
        else -> 31
    }

    for (day in 1..days) {
        println("$day.$month.$year")
    }
}