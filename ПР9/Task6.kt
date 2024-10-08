fun main() {
    // Сортировка строк: функция принимает массив строк
    // и сортирует его по алфавиту.

    val arr = arrayOf("Hello", "Ola", "Hola", "Merhaba", "Hi", "Salam", "Bonjour", "Kalimera", "Salut", "Ciao", "Hallo")

    fun stringAlphabetSort(array: Array<String>){
        println((array.sortedArray()).joinToString())
    }

    stringAlphabetSort(arr)

}