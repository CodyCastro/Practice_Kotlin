fun main() {
    print("Введите значение: ")
    val score = readln().toInt()
    var result = "?"

    when(score){
        2 -> result = " - Неудовлетворительно"
        3 -> result = " - Удовлетворительно"
        4 -> result = " - Хорошо"
        5 -> result = " - Отлично"
    }

    println(result)
}