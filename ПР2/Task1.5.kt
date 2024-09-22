fun main() {
    print("Введите число для нахождения его корня: ")
    val num = readln().toInt()

    var a = 1

    while(a * a != num){
        a +=1
    }

    print("Корень числа $num - это $a")
}