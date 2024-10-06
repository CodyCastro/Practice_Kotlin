fun main(){

    fun factorial(num: Int){
        var res = 1

        if(num == 0){
            res = 1
            println("factorial = $res")
        }
        else{
            for(i in 1..num){
                res *= i
            }
            println("factorial = $res")
        }
    }

    factorial(4)
}