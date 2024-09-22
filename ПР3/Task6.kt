fun main() {
    print("Введите год: ")
    val year = readln().toInt()

    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        print("$year - високосный")
    }
    else{
        print("$year - не високосный")
    }
}