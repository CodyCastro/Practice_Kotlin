fun main() {

    fun stringCalculate(text: String) {
        val numbers = text.split(Regex("[*/+-]")).map{it.toInt()}
        val operator = text.filter{it in "*/+-"}.toCharArray()

        val s = operator.size
        var res = numbers[0]

        for (i in 0..<s){
            when (operator[i]) {
                '+' -> res += numbers[i + 1]
                '-' -> res -= numbers[i + 1]
                '*' -> res *= numbers[i + 1]
                '/' -> res /= numbers[i + 1]
                else -> continue
            }
        }
        println(res)
    }

   stringCalculate("1+1+1+1-1")
}