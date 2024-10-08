fun main(){

    fun fizzBuzz(n: Int){

        fun comma(i: Int){
            if(i < n){
                print(", ")
            }
        }

        print("[")
        for(i in 1..n){
            if(i % 3 == 0 && i % 5 != 0){
                print("Физллл")
                comma(i)
            }
            else if(i % 5 == 0 && i % 3 != 0){
                print("Бизлллл")
                comma(i)
            }
            else if(i % 3 ==0 && i % 5 == 0){
                print("ВизллБизлл")
                comma(i)
            }
            else{
                print("$i")
                comma(i)
            }
        }
        print("]")
    }

    fizzBuzz(30)
}