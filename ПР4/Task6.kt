fun main() {
    val infinity = true
    val num = 5
    var result = "?"

    while (infinity) {
        print("Угадай число от 1 до 10: ")
        val yourNum = readln().toInt()

        when(yourNum){
            num -> {
                result = " - Да"
                break
            }
            else -> result = " - Нет"
        }
        println(result)
    }
}