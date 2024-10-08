fun main() {

    // Программа, реализующая шифр Цезаря.
    // Каждая буква смещается на 3 единицы вперёд по алфавиту.

    val arr = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                         'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

    fun caesarScipher(string: String){

        var codedString = ""

        for(i in string){
            for(j in 0..arr.size-1){
                if(i == arr[j]){
                    if(j+3 < arr.size){
                        codedString += arr[j+3].toString()
                    }
                    else if(arr[j] == 'x'){
                        codedString += arr[0].toString()
                    }
                    else if(arr[j] == 'y'){
                        codedString += arr[1].toString()
                    }
                    else if(arr[j] == 'z'){
                        codedString += arr[2].toString()
                    }
                }
            }
        }

        println(codedString)
    }

    caesarScipher("helloworld")
}