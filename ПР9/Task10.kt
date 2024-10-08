fun main() {

    val text = "В сто сорок солнц закат пылал,\n" +
               "в июль катилось лето,\n" +
               "была жара,\n" +
               "жара плыла —\n" +
               "на даче было это.\n"

    // Самое длинное слово - катилось

    fun findLongestWord(string: String){
        var maxLength = 0
        var longestWord = ""

        for (word in string.split(' ',',','—')) {
            if (word.length > maxLength) {
                maxLength = word.length
                longestWord = word
            }
        }

        println("Самое длинное слово в строке: $longestWord")
    }

    findLongestWord(text)
}
