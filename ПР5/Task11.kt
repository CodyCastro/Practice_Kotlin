import kotlin.system.exitProcess

fun main() {

    fun areAnagrams(string1: String, string2: String){
        if(string1.length != string2.length){
            println("Строки $string1 и $string2 не являются анаграммами")
            exitProcess(-1)
        }

        val charCount = IntArray(26)

        for (i in string1.indices){
            charCount[string1[i] - 'а']++
            charCount[string2[i] - 'а']--
        }

        for(i in charCount){
            if (i != 0){
                println("Строки $string1 и $string2 не являются анаграммами")
                exitProcess(-1)
            }
        }

        println("Строки $string1 и $string2 являются анаграммами")
    }

    areAnagrams("сон","нос")
}