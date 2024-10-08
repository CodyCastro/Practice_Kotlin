fun main() {

    var a = readln().toInt()
    var b = readln().toInt()

    while (a != 0 && b != 0) {
        if (a > b){
            a %= b
        }
        else{
            b %= a
        }
    }

    println(a + b)
}