fun main() {
    // Нахождение простых чисел, находит и
    // выводит все простые числа до заданного числа N.

    fun findSimpleNums(n: Int){

        print("Простые числа до $n: ")

        for(i in 2..n){
            var q = 0

            for(j in 1..i){
                if(i % j == 0){
                    q++

                    if(q > 2){
                        break
                    }
                }
            }

            if(q <= 2){
                print("$i ")
            }
        }
    }

    findSimpleNums(31)
}