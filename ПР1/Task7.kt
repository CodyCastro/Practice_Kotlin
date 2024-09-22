fun main(){

    val a = 7
    val b = 15
    val c = 100

    // Переменная, определяющая количество пробелов (пустая по умолчанию)
    var space = String()

    // Функция, задающая количество пробелов в переменную space
    fun spacenum(num: Int){

        // Добавляет столько пробелов в переменную, сколько указано в параметре num
        for(i in num downTo 1 step 1){
            space += " "
        }
    }

    // Два пробела
    spacenum(2)

    print("${a}${space}${b}${space}${c}\n")
}

