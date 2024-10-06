import kotlin.system.exitProcess

fun main() {
    val txt = "hello"
    var num = 5

    fun rec(n: Int, txt: String){

        if(num <= 0){
            exitProcess(-1)
        }

        fun printString(){
            num--
            println(txt)
            rec(n, txt)
        }

        printString()
    }

    rec(num, txt)
}