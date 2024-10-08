fun main() {
    val numbers = arrayOf(25, 81, 33, 72, 12, 2, 66, 21, 5, 10)

    for (i in 0 until numbers.size - 1) {
        for (j in 0 until numbers.size - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                val t = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = t
            }
        }
    }

    println("Отсортированный массив: ${numbers.contentToString()}")
}