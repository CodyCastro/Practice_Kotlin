fun main(){
    fun parity(num: Int){
        if(num % 2 == 0){
            println("$num - чётное число")
        }
        else{
            println("$num - нечётное число")
        }
    }

    parity(46)
}