import kotlin.system.exitProcess

fun main() {
    print("Введите a: ")
    val a = readln().toInt()
    print("Введите b: ")
    val b = readln().toInt()
    print("Введите c: ")
    val c = readln().toInt()

    var result = 0

    println()

    if(b < a && a < c || c < a && a < b){
        result = a
    }
    else if(a < b && b < c || c < b && b < a){
        result = b
    }
    else if(a < c && c < b || b < c && c < a){
        result = c
    }
    else{
        error("ошибка, среди чисел есть равные!")
    }

    print("$result - среднее число!")
}