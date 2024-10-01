fun main() {
    print("Введите a: ")
    val a = readln().toInt()
    print("Введите b: ")
    val b = readln().toInt()

    var res = 0

    fun sum(a:Int, b:Int){
        res = a + b
    }

    fun dif(a:Int, b:Int){
        res = a - b
    }

    fun prod(a:Int, b:Int){
        res = a * b
    }

    fun div(a:Int, b:Int){
        res = a / b
    }

    print("Введите знак оператора: ")
    val opeator = readln().toString()

    when(opeator){
        "+" -> sum(a,b)
        "-" -> dif(a,b)
        "*" -> prod(a,b)
        "/" -> div(a,b)
    }

    println("Результат: $res")
}