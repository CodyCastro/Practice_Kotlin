fun main(){
    val text = " 1 2 3 4 5 6 7 8 9 10"

    fun deleteSpaces(string: String){
        for(i in string){
            if(i == ' '){
                continue
            }
            else{
                print(i)
            }
        }
    }

    deleteSpaces(text)
}