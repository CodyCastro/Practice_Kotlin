fun main(){

    // Возвращает список, представляющий форму generatePyramid с n уровнями.
    // Функция консольно регистрирует форму generatePyramid с N уровнями, используя символ #.

    fun generatePyramid(n: Int){
        for (i in 1..n) {
            val floor = " ".repeat(n - i) + "#".repeat(i * 2 - 1)
            println(floor)
        }
    }

    generatePyramid(10)
}