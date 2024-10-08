fun main() {
    // Строковый анализатор (гласные, согласные)

    val text = "Привет мир!"

    val arr1 = arrayOf('а','у','е','ы','о','э','я','и','ю',
        'А','У','Е','Ы','О','Э','Я','И','Ю')
    val arr2 = arrayOf('й','ц','к','н','г','ш','щ','з','х','ф','в','п','р','л','д','ж','ч','с','м','т','б',
        'Й','Ц','К','Н','Г','Ш','Щ','З','Х','Ф','В','П','Р','Л','Д','Ж','Ч','С','М','Т','Б')

    var quantity1 = 0
    var quantity2 = 0

    fun textAnalys(string: String){
        for(i in string){
            for(j in arr1){
                if(i == j){
                    quantity1++
                }
                else{
                    continue
                }
            }

            for(k in arr2){
                if(i == k){
                    quantity2++
                }
                else{
                    continue
                }
            }
        }

        println("Количество гласных: $quantity1\n" +
                "Количество согласных: $quantity2")
    }

    textAnalys(text)
}