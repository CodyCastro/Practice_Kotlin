fun main() {
    val a = (100..999).random()
    val b = (1..100).random()
    val result1: Int = a / b
    val result2: Int = a % b

    print("Первое число - $a\n" +
            "Второе число - $b\n" +
            "$a / $b = $result1")
    if(result2 != 0){
        print(".$result2")
    }
    else
        print("\n")
}