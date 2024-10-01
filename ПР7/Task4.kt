fun main() {
    var list = arrayOf(1,1,1,1,1) // по умолчанию

    for(i in 0..4){
        print("el ${i}: ")
        list[i] = readln().toInt()
    }

    var min = list[0]

    for(i in list){
        if(i < min){
            min = i
        }
    }

    println("Минимальное число: $min")
}