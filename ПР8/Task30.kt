fun main(){
    fun sum(n: Int){
        var sum = 0

        for(i in 1..n){
            sum += i
        }

        println("Сумма чисел от 1 до $n: $sum")
    }
    
    sum(100)
}