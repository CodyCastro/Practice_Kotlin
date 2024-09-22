fun main() {
    print("Введите сторону a: ")
    val a = readln().toInt()
    print("Введите сторону b: ")
    val b = readln().toInt()
    print("Введите сторону c: ")
    val c = readln().toInt()
    var result = "?"

    result = when (a == b){
        true -> when(b == c) {
            true -> " - Равносторонний"
            false -> " - Равнобедренный"
        }
        false -> when(a == c || b == c) {
            true -> " - Равнобедренный"
            false -> " - Разносторонний"
        }
    }

    println(result)
}