fun main() {
    print("Введите a: ")
    val a = readln().toInt()
    print("Введите b: ")
    val b = readln().toInt()

    if(a % b == 0){
        print("$a кратно $b")
    }
    else{
        print("$a не кратно $b. Остаток ${a % b}")
    }
}