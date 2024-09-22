fun main() {
    print("Введите число a: ")
    val a = readln().toFloat()
    print("Введите число b: ")
    val b = readln().toFloat()

    if(a > b){
        print("$a > $b")
    }
    else{
        print("$b > $a")
    }
}