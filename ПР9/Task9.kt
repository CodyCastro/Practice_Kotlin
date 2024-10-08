fun main() {

    // Генерация пароля с n количеством символов

    val lowercaseArray = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

    val uppercaseArray = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

    val specialSymbols = arrayOf('!', '"', '#', '$', '%', '&', "'", '(', ')', '*', '+', ',', '-', '.',
        '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<',
        '=', '>', '?', '@', '[', ']', '{', '}')

    val lowercaseArraySize = lowercaseArray.size
    val uppercaseArraySize = uppercaseArray.size
    val specialSymbolsSize = specialSymbols.size



    fun generatePassword(n: Int){
        var password = ""
        var typeSelection = 0

        fun addLowercaseSymbol(){
            val symbolSelection = (0..lowercaseArraySize-1).random()
            password += lowercaseArray[symbolSelection]
        }
        fun addUppercaseSymbol(){
            val symbolSelection = (0..uppercaseArraySize-1).random()
            password += uppercaseArray[symbolSelection]
        }
        fun addSpecialSymbol(){
            val symbolSelection = (0..specialSymbolsSize-1).random()
            password += specialSymbols[symbolSelection]
        }

        for(i in 1..n){
            typeSelection = (1..3).random()

            when(typeSelection){
                1 -> {addLowercaseSymbol()}
                2 -> {addUppercaseSymbol()}
                3 -> {addSpecialSymbol()}
            }
        }

        println(password)
    }

    generatePassword(18)
}