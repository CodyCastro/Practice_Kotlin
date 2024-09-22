fun main() {
    print("Enter a: ")
    val a = readln().toInt()
    print("Enter b: ")
    val b = readln().toInt()
    print("Enter c: ")
    val c = readln().toInt()

    var result = 0

    println()

    if(a > b && a > c){
        result = a
    }
    else if(b > a && b > c){
        result = b
    }
    else if(c > a && c > b){
        result = c
    }

    print("${result} is the largest number!")
}