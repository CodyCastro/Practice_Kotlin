fun main() {
    print("Введите число a: ")
    val a = readln().toInt()
    print("Введите число b: ")
    val b = readln().toInt()

    if(a % b == 0){
        print("$b - делитель числа $a")
    }
    else{
        print("$b не является делителем числа $a")
    }
}