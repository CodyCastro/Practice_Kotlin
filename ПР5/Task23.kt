fun main() {

    print("Введите a: ")
    val a = readln().toInt()

    print("Введите b: ")
    val b = readln().toInt()

    print("'+' для сложения\n" +
            "'*' для умножения\n" +
            "Введите знак: ")
    val operator = readln().toString()

    while (true){
        if(operator == "+"){
            println("Сумма =  ${a + b}")
        }
        else{
            println("Произведение =  ${a * b}")
        }

        print("Продолжить? (Да/Стоп): ")
        val answer = readln().toString()

        when(answer){
            "Да" -> continue
            "Стоп" -> break
        }
    }
}