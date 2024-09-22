fun main() {
    print("Введите двузначное число a: ")
    val a = readln().toInt()
    val firstDigit = a / 10
    val secondDigit = a % 10

    if(firstDigit > secondDigit){
        println("а) Первая цифра $firstDigit больше второй $secondDigit")
    }
    else if(firstDigit == secondDigit){
        println("a) Цифры числа $a равны")
    }
    else{
        println("а) Вторая цифра $secondDigit больше первой $firstDigit")
    }

    if(firstDigit == secondDigit){
        print("б) Цифры числа $a одинаковы")
    }
    else{
        print("б) Цифры числа $a отличаются")
    }
}