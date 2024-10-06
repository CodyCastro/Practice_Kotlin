fun main(){
    val text = "123456789"

    fun symbolsQuantity(string: String){
        var quantity = 0

        for(i in string){
            quantity += 1
        }

        println("Количество символов в строке: $quantity")
    }

    symbolsQuantity(text)
}