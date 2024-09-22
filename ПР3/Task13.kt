fun main() {
    print("Введите четырёхзначное число a: ")
    val num = readln().toInt()
    val firstDigit = num / 1000
    val secondDigit = num / 100 % 10
    val thirdDigit = num / 10 % 10
    val forthDigit = num % 10
    val sum = firstDigit + secondDigit + thirdDigit + forthDigit
    val product = firstDigit * secondDigit * thirdDigit * forthDigit
    val a = 7

    if(firstDigit + secondDigit == thirdDigit + forthDigit){
        println("а) Сумма первых двух чисел равна сумме последних чисел (${firstDigit+secondDigit} = ${thirdDigit + forthDigit})")
    }
    else{
        println("а) Сумма первых двух чисел НЕ равна сумме последних чисел (${firstDigit + secondDigit} ≠ ${thirdDigit + forthDigit})")
    }

    if(sum % 3 == 0){
        println("б) Сумма цифр числа ($sum) кратна 3")
    }
    else{
        println("б) Сумма цифр числа ($sum) НЕ кратна 3")
    }

    if(product % 4 == 0){
        println("б) Произведение цифр числа ($product) кратно 4")
    }
    else{
        println("б) Произведение цифр числа ($product) НЕ кратно 4")
    }

    if(product % a == 0){
        println("б) Произведение цифр числа ($product) кратно $a")
    }
    else{
        println("б) Произведение цифр числа ($product) НЕ кратно $a")
    }
}