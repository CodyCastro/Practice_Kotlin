fun main() {
    print("Введите число: ")
    val a = readln().toInt()
    var result = "?"

    result = when (a > 0) {
        true -> "Знак +"
        false -> when (a < 0){
            true -> "Знак -"
            false -> "Не имеет знак"
        }
    }

    println(result)
}