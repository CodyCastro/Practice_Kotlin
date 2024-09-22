fun main() {
    print("" +
                "+---------------------+\n" +
                "|    Способы оплаты   |\n"+
                "+---------------------+\n" +
                "| 1 - наличные        |\n" +
                "| 2 - VISA            |\n" +
                "| 3 - Paypal          |\n" +
                "| 4 - QIWI            |\n" +
                "| 5 - MasterCard      |\n" +
                "| 6 - Яндекс деньги   |\n" +
                "+---------------------+\n")

    print("Выберите способ оплаты: ")
    val Type = readln().toInt()
    var result = "?"

    when(Type){
        1 -> result = " - Оплата наличными"
        2 -> result = " - Оплата с помощью VISA"
        3 -> result = " - Оплата с помощью Paypal"
        4 -> result = " - Оплата с помощью QIWI"
        5 -> result = " - Оплата с помощью MasterCard"
        6 -> result = " - Оплата с помощью Яндекс деньги"
        else -> print ("ошибка")
    }

    println(result)
}