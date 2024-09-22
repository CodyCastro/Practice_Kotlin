fun main() {
    
    print("Введите число: ")
    var num = readln().toInt()
    print("Введите сепень, в которую нужно возвести число $num\n")
    val s = readln().toInt()

    // Число на которое мы умножаем при возведении в степень
    val num2 = num

    for(i in s downTo 2 step 1){
        num *= num2
    }

    print("Результат: $num\n")
}