fun main() {
    var wins = 0
    var defeats = 0
    val draws = 0
    var res = 0

    fun countScore (w:Int, d:Int, dr:Int){
        wins = w*3
        defeats = d

        res = wins + defeats + draws
    }

    countScore(6,2,1)

    println("Количество очков: $res")
}