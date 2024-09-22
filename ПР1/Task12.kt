fun main(){

    var a: Int

    // Функция выводит столько рандомных значений столбиком, сколько указано в параметре num
    fun numbers(num: Int){
        for(i in num downTo 1 step 1){
            a = (0..100).random()
            print("${a}\n")
        }
    }

    // Четыре числа в столбик
    numbers(4)
}