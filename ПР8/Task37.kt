fun main(){
    fun multiplicationTable(n: Int){
        for(i in 1..10){
            println("$i * $n = ${i*n}")
        }
    }
    
    multiplicationTable(5)
}