fun main() {
    fun sum(quantity: Int){
        var sum = 0
        var num = 0

        for(i in 1..quantity){
            print("$i элемент: ")
            num = readln().toInt()
            sum += num
        }

        println("Сумма: $sum")
    }

    sum(5)
}