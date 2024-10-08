fun main() {

    print("Введите n: ")
    val num = readln().toInt()

    for (i in 1..num){
        print(" ".repeat(num-i))

        for (j in 1..i) {
            print("$i")
            print(" ".repeat(num.toString().length-(i.toString().length-1)))
        }

        println("")
    }
}