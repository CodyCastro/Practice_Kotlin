fun main() {
    // Генератор случайных чисел

    val n = 10

    for(i in 1..n){
        println("$i. ${(1..100).random()}")
    }
}