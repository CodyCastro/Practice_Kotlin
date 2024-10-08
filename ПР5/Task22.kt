fun main() {
    // Угадай число от 1 до 100

    val randNum = (0..100).random()

    while (true) {
        print("Введите число: ")
        val yourNum = readln().toInt()

        if (yourNum == randNum) {
            println("- Вы угадали! Это число $randNum")
            break
        }

        if (randNum > yourNum) {
            println("- Число больше")
        } else {
            println("- Число меньше")
        }
    }
}