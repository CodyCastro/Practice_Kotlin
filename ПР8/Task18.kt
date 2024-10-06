fun main(){

    fun num(a: Int){
        if (a < 2) {
            println("Число $a - простое")
        }
        for (i in 2..Math.sqrt(a.toDouble()).toInt()){
            if (a % i == 0) {
                println("Число $a - не простое")
            }
        }
        println("Число $a - простое")
    }

    num(7)
}