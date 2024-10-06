fun main() {
    val arr = mutableListOf(11,24,36,74,58,63,71,18,49,510)

    println("[" + arr.joinToString() + "]" + "\n")

    fun index(input: Int){
        if(input in arr){
            for(i in arr){
                when(input){
                    i -> println("Индекс: " + arr.indexOf(i))
                }
            }
        }
        else{
            println("-1")
        }
    }

    index(58)
}