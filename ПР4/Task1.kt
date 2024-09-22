fun main() {
    print("Введите номер дня недели (1-7)")
    val day = readln().toInt()
    var result = "?"

    when(day){
        1 -> result = " - Понедельник"
        2 -> result = " - Вторник"
        3 -> result = " - Среда"
        4 -> result = " - Четверг"
        5 -> result = " - Пятница"
        6 -> result = " - Суббота"
        7 -> result = " - Воскресенье"
    }

    println(result)
}