fun main() {
    print("Введите время суток: ")
    val time = readln().toInt()
    var result = "?"

    when(time){
        in 0..4 -> result = " - Ночь"
        in 5..12 -> result = " - Утро"
        in 13..16 -> result = " - День"
        in 17..23 -> result = " - Вечер"
    }

    println(result)
}