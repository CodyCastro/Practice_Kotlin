fun main() {
    val arr = arrayOf(1,'x',3,4,"Hello",6,7,8,true,10)
    println("[" + arr.joinToString() + "]")
    println("Уникальные элеменеты массива: ")

    for(i in arr){
        if(i is Int){
            continue
        }

        else{
            println(i)
        }
    }
}