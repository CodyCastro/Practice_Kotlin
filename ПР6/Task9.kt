fun main() {
    val arr = arrayOf(16,26,36,46,56)
    val arr1 = arr.copyOf()
    println("Оригинальный массив: " + arr.joinToString())
    println("Копия массива: " + arr1.joinToString())

}