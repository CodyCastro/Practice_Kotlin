fun main(){
    val vowelLetters = arrayOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')

    fun  isVowelLetters(string: String){
        var quantity = 0

        for(i in string){
            for(j in vowelLetters){
                if(i == j){
                    quantity++
                }
                else{
                    continue
                }
            }
        }

        println("Количество гласных в строке: $quantity")
    }

    isVowelLetters("привет, мир!")
}