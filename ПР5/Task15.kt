fun main() {
    println("Введите строку:")
    val text= readln()

    if (text == text.reversed()) {
        println("Строка $text - является палиндромом.")
    } else {
        println("Строка $text - не является палиндромом.")
    }
}