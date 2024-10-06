fun main(){
    fun findSubString(string: String, stringToFind: String){
        if(string.contains(stringToFind)){
            println("Строка $string содержит строку $stringToFind")
        }
        else{
            println("Строка $string не содержит строку $stringToFind")
        }
    }

    findSubString("123456789","678")
}