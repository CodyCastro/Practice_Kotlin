fun main(){

    print("Введите количество квадратов: ")
    val n = readln().toInt()

    var sum = 0

    for (i in 1..n){
        sum = sum + i*i
    }

    println("Сумма квадратов от 1 до $n = $sum")
}