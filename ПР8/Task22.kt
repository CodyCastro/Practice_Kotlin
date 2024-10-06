fun main(){
    val text = "1111"

    fun isStringPalindrome(string: String){
        if(string == string.reversed()){
            println("Строка является палиндромом")
        }
        else{
            println("Строка не является палиндромом")
        }
    }

    isStringPalindrome(text)
}