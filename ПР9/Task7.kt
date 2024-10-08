fun main() {

    // Программа принимает строку и меняет регистр букв на противоположный

    val lowercaseArray = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

    val uppercaseArray = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                                 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

    val specialSymbols = arrayOf('!', '"', '#', '$', '%', '&', "'", '(', ')', '*', '+', ',', '-', '.',
                                 '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<',
                                 '=', '>', '?', '@', '[', ']', '{', '}', ' ')

    fun changeCase(string: String){
        for(i in string){

            for(s in specialSymbols){
                if(i == s){
                    print(i)
                }
            }

            for(j in lowercaseArray){
                if(i == j){
                    print("${i.uppercaseChar()}")
                }
                else{
                    continue
                }
            }

            for(k in uppercaseArray){
                if(i == k){
                    print("${i.lowercaseChar()}")
                }
                else{
                    continue
                }
            }
        }
    }

    changeCase("Hello, WoRlD!")
}