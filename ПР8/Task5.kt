fun main() {
    fun probSizePay(prob: Int, prize: Int, pay: Int): Boolean{

        return prob * prize > pay
    }

    println(probSizePay(5,2,3))
}