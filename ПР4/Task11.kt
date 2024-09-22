fun main() {
    print(
                "+--------+\n" +
                "| 1 - O  |\n" +
                "| 2 - A  |\n" +
                "| 3 - B  |\n" +
                "| 4 - AB |\n" +
                "+--------+\n")

    print("Введите группу крови: ")
    val foodType = readln().toInt()
    var result = "?"

    when(foodType){
        1 -> result = " - может отдавать: 0,A,B,AB\n" +
                      "- может принимать 0"
        2 -> result = " - может отдавать: A,AB\n" +
                      "- может принимать 0,A"
        3 -> result = " - может отдавать: B,AB\n" +
                      "- может принимать 0,B"
        4 -> result = " - может отдавать: AB\n" +
                      "- может принимать 0,A,B,AB"
        else -> print ("ошибка")
    }

    println(result)
}