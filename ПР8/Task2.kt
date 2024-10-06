fun main() {
    fun dif(){
        val arr = arrayOf(1,1,1,1,1)

        for(i in 0..4){
            print("$i элемент: ")
            arr[i] = readln().toInt()
        }

        var max = arr[0]
        var min = arr[0]

        for(i in arr){
            if(i > max){
                max = i
            }
        }

        for(i in arr){
            if(i < min){
                min = i
            }
        }

        println("max $max")
        println("min $min")
        println("Разность: ${max - min}")
    }

    dif()
}