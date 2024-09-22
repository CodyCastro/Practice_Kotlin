fun main() {
    print("Введите число m: ")
    val m = readln().toInt()
    print("Введите число n: ")
    val n = readln().toInt()

    if(m%n == 0){
        println(m/n)
    }
    else{
        println("$m на $n нацело не делится.")
    }
}