fun main(){

    fun cToF(celsius: Double){
        val fahrenheit = (celsius * 9/5 + 32)

        println("$celsius C = $fahrenheit F")
    }

    cToF(26.0)
}