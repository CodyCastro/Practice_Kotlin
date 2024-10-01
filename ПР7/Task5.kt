fun main() {
    var areTheNumbersEqual: Boolean

    // сравнение
    fun comparison(a:Int,b:Int){
        if(a == b){
            areTheNumbersEqual = true
        }
        else{
            areTheNumbersEqual = false
        }

        println(areTheNumbersEqual)
    }

    comparison(2, 2)
}