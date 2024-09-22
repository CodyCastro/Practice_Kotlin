fun main() {
    print("Введите число a: ")
    val a = readln().toInt()

    if(a % 2 == 0){
        println("а) $a - чётное число")
    }
    else{
        println("а) $a - нечётное число")
    }

    if(a % 10 == 7){
        println("б) 7 - последняя цифра числа")
    }
    else{
        println("б) 7 - не являяется последней цифрой числа")
    }
}